import java.util.Scanner;

public class Ejercicio2_PromedioNotasAltas {
    Scanner teclado = new Scanner(System.in);

    public void promedioDosMayores() {
        System.out.println("Ingrese la primera nota: ");
        double n1=teclado.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        double n2=teclado.nextInt();
        System.out.println("Ingrese la tercera nota: ");
        double n3=teclado.nextInt();
        double menor = Math.min(n1, Math.min(n2, n3));
        double promedio = (n1 + n2 + n3 - menor) / 2;
        System.out.println("Promedio de las dos notas mayores: " + promedio);
    }

    public static void main(String[] args) {
        Ejercicio2_PromedioNotasAltas obj = new Ejercicio2_PromedioNotasAltas();
        obj.promedioDosMayores();
    }
}
