import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, base;
        int digito;
        boolean pertenece = true;
        System.out.println("Ingrese el número:");
        numero = teclado.nextInt();
        System.out.println("Ingrese la base:");
        base = teclado.nextInt();
        do {
            digito = numero % 10;
            if (digito >= base) {
                pertenece = false;
            }
            numero = numero / 10;
        } while (numero != 0);
        if (pertenece) {
            System.out.println("El número pertenece a la base ingresada.");
        } else {
            System.out.println("El número NO pertenece a la base ingresada.");
        }
    }
}
