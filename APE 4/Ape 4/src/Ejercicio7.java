import java.util.Scanner;

public class Ejercicio7 {

    private String[] vector;
    private String[] invertido;
    private Scanner teclado;

    public Ejercicio7() {
        vector = new String[5];
        invertido = new String[5];
        teclado = new Scanner(System.in);
    }

    public void leerCadenas() {
        System.out.println("Ingrese 5 cadenas de texto:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            vector[i] = teclado.nextLine();
        }
    }

    public void invertirVector() {
        for (int i = 0; i < vector.length; i++) {
            invertido[i] = vector[vector.length - 1 - i];
        }
    }

    public void mostrarInvertido() {
        System.out.println("Vector en orden inverso:");
        for (String palabra : invertido) {
            System.out.println(palabra);
        }
    }

    public static void main(String[] args) {
        Ejercicio7 app = new Ejercicio7();
        app.leerCadenas();
        app.invertirVector();
        app.mostrarInvertido();
    }
}
