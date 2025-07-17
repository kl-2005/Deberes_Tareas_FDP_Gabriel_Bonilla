import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int i = 2;
        boolean esPrimo = true;
        System.out.println("Ingrese un número:");
        numero = teclado.nextInt();
        if (numero <= 1) {
            esPrimo = false;
        } else {
            do {
                if (numero % i == 0) {
                    esPrimo = false;
                }
                i++;
            } while (i <= numero/2 && esPrimo);
        }
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " NO es un número primo.");
        }
    }
}
