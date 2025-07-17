import java.util.Scanner;

public class Ejercicio4_SumaParesImpares {
    Scanner teclado = new Scanner(System.in);

    public void sumaDigitos() {
        System.out.println("Ingrese el número: ");
        int numero=teclado.nextInt();
        int sumaPares = 0, sumaImpares = 0;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) sumaPares += digito;
            else sumaImpares += digito;
            numero /= 10;
        }
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
    }

    public static void main(String[] args) {
        Ejercicio4_SumaParesImpares obj = new Ejercicio4_SumaParesImpares();
        obj.sumaDigitos();
    }
}

