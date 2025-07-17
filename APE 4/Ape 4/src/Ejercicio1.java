import java.util.Scanner;

public class Ejercicio1 {

    public static void leerNumeros(int[] vector, Scanner teclado) {
        System.out.println("Ingrese 4 números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = teclado.nextInt();
        }
    }

    public static int calcularSuma(int[] vector) {
        int suma = 0;
        for (int num : vector) {
            suma += num;
        }
        return suma;
    }

     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[4];

        leerNumeros(numeros, teclado);
        int suma = calcularSuma(numeros);
        double promedio = suma / 4.0;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
