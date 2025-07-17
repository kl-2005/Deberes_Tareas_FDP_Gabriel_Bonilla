import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int n1,n2,mcd;
    System.out.println("Ingrese el primer denominador");
    n1=teclado.nextInt();
    System.out.println("Ingrese el segundo denominador");
    n2=teclado.nextInt();
    while (n2!=0) {
        int temp=n2;
        n2=n1%n2;
        n1=temp;
    }
    System.out.println("Maximo Común Divisor es: "+n1);
    
}
}
