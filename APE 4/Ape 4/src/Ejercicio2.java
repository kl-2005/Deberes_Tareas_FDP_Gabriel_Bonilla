import java.util.Scanner;

public class Ejercicio2 {

    public static void leerNumeros(int[] vector, Scanner teclado) {
        System.out.println("Ingrese 6 números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = teclado.nextInt();
        }
    }

    public static int contarMultiplos(int[] vector, int n) {
        int conteo = 0;
        for (int num : vector) {
            if (num % n == 0) {
                conteo++;
            }
        }
        return conteo;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[6];

        leerNumeros(numeros, teclado);
        System.out.print("Ingrese el número para buscar múltiplos: ");
        int n = teclado.nextInt();
        int conteo = contarMultiplos(numeros, n);

        System.out.println("Cantidad de múltiplos de " + n + ": " + conteo);
    }
}
