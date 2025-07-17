import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n,nC; String b="";
        System.out.println("Ingrese el número en base 10");
        n=teclado.nextInt();
        while (n>0) {
            nC=n%2;
            b=nC+b;
            n=n/2;
        }
        System.out.println("El número en base 2 o binario es: "+b);

    }
}
