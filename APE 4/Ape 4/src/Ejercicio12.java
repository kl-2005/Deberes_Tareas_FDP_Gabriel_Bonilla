import java.util.Scanner;

public class Ejercicio12 {
    private Scanner teclado;
    private String nombresMayores;

    public Ejercicio12() {
        teclado = new Scanner(System.in);
        nombresMayores = "";
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
                    nombresMayores += "\n";
                }
                nombresMayores += nombre;
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

    public static void main(String[] args) {
        Ejercicio12 ejercicio = new Ejercicio12();
        ejercicio.leerDatos();
        ejercicio.mostrarMayores();
    }
}
