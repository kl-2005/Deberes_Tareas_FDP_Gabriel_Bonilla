import java.util.Random;
import java.util.Scanner;

public class Ejercicio7_OperacionesMatrices {
    static int[][] A;
    static int[][] B;
    static int[][] suma;
    static int[][] producto;
    static int n;

    public static void llenarMatricesAleatorias() {
        Random rand = new Random();
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                A[f][c] = rand.nextInt(20);
                B[f][c] = rand.nextInt(20);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz, String nombre) {
        System.out.println("\nMatriz " + nombre + ":");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + "\t");
            }
            System.out.println();
        }
    }

    public static int sumarMatrices() {
        int sumaTotal = 0;
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                suma[f][c] = A[f][c] + B[f][c];
                sumaTotal += suma[f][c];
            }
        }
        mostrarMatriz(suma, "Suma");
        return sumaTotal;
    }

    public static int mayorElementoSuma() {
        int mayor = Integer.MIN_VALUE;
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                if (suma[f][c] > mayor) {
                    mayor = suma[f][c];
                }
            }
        }
        System.out.println("Elemento mayor de la matriz suma: " + mayor);
        return mayor;
    }

    public static void multiplicarMatrices() {
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                producto[f][c] = 0;
                for (int k = 0; k < n; k++) {
                    producto[f][c] += A[f][k] * B[k][c];
                }
            }
        }
        mostrarMatriz(producto, "Producto");
    }

    public static void mostrarPromedio(int sumaTotal) {
        double promedio = (double) sumaTotal / (n * n * 2);
        System.out.printf("Promedio total de elementos: %.2f\n", promedio);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese tamaño de la matriz (n x n): ");
        n = teclado.nextInt();
        A = new int[n][n];
        B = new int[n][n];
        suma = new int[n][n];
        producto = new int[n][n];
        llenarMatricesAleatorias();
        mostrarMatriz(A, "A");
        mostrarMatriz(B, "B");
        int sumaTotal = sumarMatrices();
        mostrarPromedio(sumaTotal);
        mayorElementoSuma();
        multiplicarMatrices();
    }
}
