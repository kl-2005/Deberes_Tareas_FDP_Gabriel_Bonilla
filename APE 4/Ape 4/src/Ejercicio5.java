import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] primos = new int[10];

        System.out.print("Ingrese un número: ");
        int n = teclado.nextInt();

        encontrarPrimos(n, primos);
        int suma = calcularSuma(primos);
        double promedio = suma / 10.0;

        System.out.println("Primos encontrados:");
        for (int p : primos) {
            System.out.print(p + " ");
        }
        System.out.println("\nSuma: " + suma);
        System.out.println("Promedio: " + promedio);
    }

    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void encontrarPrimos(int desde, int[] vector) {
        int contador = 0;
        int numero = desde + 1;
        while (contador < vector.length) {
            if (esPrimo(numero)) {
                vector[contador] = numero;
                contador++;
            }
            numero++;
        }
    }

    public static int calcularSuma(int[] vector) {
        int suma = 0;
        for (int num : vector) {
            suma += num;
        }
        return suma;
    }
}
