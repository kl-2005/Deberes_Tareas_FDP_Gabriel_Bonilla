import java.util.Scanner;

public class Ejercicio8 {
    private double[] notas;
    private Scanner teclado;

    public Ejercicio8() {
        notas = new double[5];
        teclado = new Scanner(System.in);
    }

    public void leerNotas() {
        System.out.println("Ingrese 5 notas (0 a 10):");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }
    }

    public void procesarNotas() {
        double suma = 0;
        double max = notas[0];
        double min = notas[0];

        for (double nota : notas) {
            suma += nota;
            if (nota > max) max = nota;
            if (nota < min) min = nota;
        }

        double media = suma / notas.length;

        System.out.println("Notas ingresadas:");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        System.out.println("\nNota media: " + media);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);
    }

    public static void main(String[] args) {
        Ejercicio8 app = new Ejercicio8();
        app.leerNotas();
        app.procesarNotas();
    }
}
