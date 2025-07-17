import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        leerNumeros(numeros, teclado);
        System.out.print("Ingrese A (ascendente) o D (descendente): ");
        String orden = teclado.next().toUpperCase();

        ordenar(numeros, orden);
        System.out.println("Números ordenados:");
        mostrarVector(numeros);
    }

    public static void leerNumeros(int[] vector, Scanner teclado) {
        System.out.println("Ingrese 5 números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = teclado.nextInt();
        }
    }

    public static void ordenar(int[] vector, String tipo) {
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                boolean debeIntercambiar = tipo.equals("A") ? vector[i] > vector[j] : vector[i] < vector[j];
                if (debeIntercambiar) {
                    int temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                }
            }
        }
    }

    public static void mostrarVector(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

