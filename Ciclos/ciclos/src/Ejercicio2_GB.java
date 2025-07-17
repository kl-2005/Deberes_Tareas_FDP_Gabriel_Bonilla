import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        long n1,i,contN=0,cont;
        System.out.println("Ingrese el número");
        n1=teclado.nextLong();
        while (n1>0) {
            i=n1%10;
            if (i%2==0) {
                contN+=1;
            }else{
                cont=0;
            }
            n1=n1/10;
        }
        System.out.println("Número total de digitos pares: "+contN);
    }
}
