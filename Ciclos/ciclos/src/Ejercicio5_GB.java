import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int n,nB,n1;
    System.out.println("Ingrese el número que va analizar");
    n=teclado.nextInt();
    System.out.println("Ingrese el número que busca");
    nB=teclado.nextInt();
    while (n>0) {
        n1=n%10;
        n=n/10;
        if (n1==nB) {
            System.out.println(n1+" Existe en el número proporcionado ");
        }else{
            System.out.println("No hay coincidencias");
        }
    }
}
}
