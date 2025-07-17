import java.util.Scanner;

public class Ejercicio11 {
    private Scanner teclado;
    private String nombresMayores;
    private int sumaMenores;
    private int contadorMenores;

    public Ejercicio11() {
        teclado = new Scanner(System.in);
        nombresMayores = "";
        sumaMenores = 0;
        contadorMenores = 0;
    }

    public void leerDatos() {
        while (true) {
            System.out.print("Ingrese nombre (* para finalizar): ");
            String nombre = teclado.nextLine();
            if (nombre.equals("*")) break;

            System.out.print("Ingrese edad: ");
            int edad = Integer.parseInt(teclado.nextLine());

            if (edad >= 18) {
                if (!nombresMayores.isEmpty()) {
                    nombresMayores += ", ";
                }
                nombresMayores += nombre;
            } else {
                sumaMenores += edad;
                contadorMenores++;
            }
        }
    }

    public void mostrarMayores() {
        System.out.println("Alumnos mayores de edad:");
        if (nombresMayores.isEmpty()) {
            System.out.println("No hay mayores de edad.");
        } else {
            System.out.println(nombresMayores);
        }
    }

    public void mostrarPromedioMenores() {
        System.out.println("Promedio de edad de los menores de edad:");
        if (contadorMenores > 0) {
            System.out.println((double) sumaMenores / contadorMenores);
        } else {
            System.out.println("No hay menores de edad.");
        }
    }

    public static void main(String[] args) {
        Ejercicio11 ejercicio = new Ejercicio11();
        ejercicio.leerDatos();
        ejercicio.mostrarMayores();
        ejercicio.mostrarPromedioMenores();
    }
}
