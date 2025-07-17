import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int n,nM=0,nD;
        System.out.println("Ingrese el número");
        n=teclado.nextInt();
        if (n==0) {
            nM=0;
        }else{
            do{
                nD=n%10;
                if (nD>nM) {
                    nM=nD;
                }
                n=n/10;
            }while(n!=0);
        }
        System.out.println("Dígito mayor "+nM);
    }
}
