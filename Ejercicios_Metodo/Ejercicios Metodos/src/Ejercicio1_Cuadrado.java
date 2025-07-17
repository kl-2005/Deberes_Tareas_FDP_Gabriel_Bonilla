import java.util.Scanner;

public class Ejercicio1_Cuadrado {
    Scanner teclado = new Scanner(System.in);

    public void cuadrado() {
        System.out.println("Ingrese el valor del lado: ");
        int lado = teclado.nextInt();
        double area = lado * lado;
        double perimetro = 4 * lado;
        System.out.println("Área: " + area+" m^2");
        System.out.println("Perímetro: " + perimetro+" m");
    }

    public static void main(String[] args) throws Exception {
        Ejercicio1_Cuadrado obj = new Ejercicio1_Cuadrado();
        obj.cuadrado();
    }
}
