import java.util.Scanner;

public class Ejercicio6_AreaRectangulo {
    Scanner teclado = new Scanner(System.in);

    public double areaRectangulo() {
        System.out.println("Ingrese la base: ");
        int base = teclado.nextInt();
        System.out.println("Ingrese la altura: ");
        int altura=teclado.nextInt();
        return base * altura;
    }
 
    public static void main(String[] args) {
        Ejercicio6_AreaRectangulo obj= new Ejercicio6_AreaRectangulo();
        System.out.println("El area es: "+obj.areaRectangulo());
    }
}
