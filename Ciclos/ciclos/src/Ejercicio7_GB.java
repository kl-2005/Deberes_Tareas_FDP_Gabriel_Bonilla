import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n,c=0;
        System.out.println("Ingrese la cantidad de múltiplos de 5 que desea obtener:");
        n=teclado.nextInt();
        System.out.println("Los primeros " + n + " múltiplos de 5 son:");
        do{
            c+=1;
            System.out.println(c*5);
        }while(c<n);
    }
}
