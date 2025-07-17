import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado =new Scanner(System.in); 
        int nt=0,ri,rf;
        System.out.println("Ingrese el rango inicial");
        ri=teclado.nextInt();
        System.out.println("Ingrese el rango final");
        rf=teclado.nextInt();
        while (ri<rf) {
            nt+=1;
            ri+=1;   
        }
        System.out.println("La cantidad de enteros es: "+nt);
    }
}
