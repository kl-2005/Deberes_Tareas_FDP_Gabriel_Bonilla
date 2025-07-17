import java.util.Random;

public class Ejercicio9 {
    private int[] numeros;
    private Random random;

    public Ejercicio9() {
        numeros = new int[10];
        random = new Random();
    }

    public void generarNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100); // Números entre 0 y 99
        }
    }

    public void ordenarNumeros() {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
    }

    public void mostrarNumeros() {
        System.out.println("Números ordenados de menor a mayor:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ejercicio9 app = new Ejercicio9();
        app.generarNumeros();
        app.ordenarNumeros();
        app.mostrarNumeros();
    }
}
