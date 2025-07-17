import java.util.Scanner;

public class Ejercicio4 {

    public static void leerNumeros(int[] vector, Scanner teclado) {
        System.out.println("Ingrese 6 números:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = teclado.nextInt();
        }
    }

    public static int contarRepetidos(int[] vector) {
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    contador++;
                    break;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[6];

        leerNumeros(numeros, teclado);
        int repetidos = contarRepetidos(numeros);

        System.out.println("Cantidad de números repetidos: " + repetidos);
    }
}
