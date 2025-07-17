import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,i;
        System.out.println("Ingrese el número:");
        n1 = teclado.nextInt();
        while (n1>0){
            i=n1%10;
            System.out.print(i);
            n1=n1/10;
        }
    }
}

