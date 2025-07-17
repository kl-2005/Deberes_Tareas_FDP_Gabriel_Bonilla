import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,n2,sumaDivN1=0,sumaDivN2=0,i;
        System.out.println("Ingrese el primer número:");
        n1=teclado.nextInt();
        System.out.println("Ingrese el segundo número:");
        n2=teclado.nextInt();
        i=1;
        do{
            if(n1%i==0) {
                sumaDivN1+=i;
            }
            i++;
        }while(i<=n1/2);
        i=1;
        do {
            if (n2%i==0) {
                sumaDivN2+=i;
            }
            i++;
        } while (i<=n2/2);
        if (sumaDivN1==n2&&sumaDivN2==n1) {
            System.out.println(n1+" y "+n2+" son números amigos.");
        } else {
            System.out.println(n1+" y "+n2+" NO son números amigos.");
        }
    }
}
