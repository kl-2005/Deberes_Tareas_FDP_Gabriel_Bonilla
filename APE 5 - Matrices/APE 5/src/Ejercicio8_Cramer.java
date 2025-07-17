import java.util.Scanner;

public class Ejercicio8_Cramer {

    public static void resolverSistema(double a, double b, double e, double c, double d, double f) {
        double D = a * d - b * c;  // Determinante principal
        if (D == 0) {
            System.out.println("El sistema no tiene solución única (determinante = 0).");
        } else {
            double Dx = e * d - b * f;
            double Dy = a * f - e * c;
            double x = Dx / D;
            double y = Dy / D;
            System.out.printf("Solución:\nx = %.4f\ny = %.4f\n", x, y);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sistema de ecuaciones lineales 2x2 (ax + by = e, cx + dy = f)");
        System.out.print("Ingrese a: ");
        double a = teclado.nextDouble();
        System.out.print("Ingrese b: ");
        double b = teclado.nextDouble();
        System.out.print("Ingrese e: ");
        double e = teclado.nextDouble();
        System.out.print("Ingrese c: ");
        double c = teclado.nextDouble();
        System.out.print("Ingrese d: ");
        double d = teclado.nextDouble();
        System.out.print("Ingrese f: ");
        double f = teclado.nextDouble();
        resolverSistema(a, b, e, c, d, f);
    }
}
