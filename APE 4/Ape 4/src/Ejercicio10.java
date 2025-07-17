import java.util.Scanner;

public class Ejercicio10 {
    public static void leerVector(int[] vector, Scanner teclado) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Valor " + i + " = ");
            vector[i] = teclado.nextInt();
        }
    }

    public static void sumarVectores(int[] v1, int[] v2, int[] v3) {
        for (int i = 0; i < v1.length; i++) {
            v3[i] = v1[i] + v2[i];
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int val : vector) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        System.out.println("Ingrese valores para vector1:");
        leerVector(vector1, teclado);

        System.out.println("Ingrese valores para vector2:");
        leerVector(vector2, teclado);

        sumarVectores(vector1, vector2, vector3);

        System.out.println("vector3 (suma de vector1 y vector2):");
        mostrarVector(vector3);
    }
}
