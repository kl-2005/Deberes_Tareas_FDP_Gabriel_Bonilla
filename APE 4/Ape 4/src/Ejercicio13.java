import java.util.Scanner;

public class Ejercicio13 {
    private Scanner teclado;
    private double[] tempMin;
    private double[] tempMax;
    private double[] tempProm;
    private final int dias = 5;

    public Ejercicio13() {
        teclado = new Scanner(System.in);
        tempMin = new double[dias];
        tempMax = new double[dias];
        tempProm = new double[dias];
    }

    public void leerTemperaturas() {
        for (int i = 0; i < dias; i++) {
            System.out.print("Día " + (i + 1) + " - Temp. mínima: ");
            tempMin[i] = teclado.nextDouble();
            System.out.print("Día " + (i + 1) + " - Temp. máxima: ");
            tempMax[i] = teclado.nextDouble();
            tempProm[i] = (tempMin[i] + tempMax[i]) / 2;
        }
    }

    public int diaMayorPromedio() {
        double mayorProm = tempProm[0];
        int diaMayor = 0;
        for (int i = 1; i < dias; i++) {
            if (tempProm[i] > mayorProm) {
                mayorProm = tempProm[i];
                diaMayor = i;
            }
        }
        return diaMayor;
    }

    public int diaMenorPromedio() {
        double menorProm = tempProm[0];
        int diaMenor = 0;
        for (int i = 1; i < dias; i++) {
            if (tempProm[i] < menorProm) {
                menorProm = tempProm[i];
                diaMenor = i;
            }
        }
        return diaMenor;
    }

    public void mostrarTemperaturas() {
        System.out.println("Temperatura media de cada día:");
        for (int i = 0; i < dias; i++) {
            System.out.println("Día " + (i + 1) + ": " + tempProm[i]);
        }
    }

    public static void main(String[] args) {
        Ejercicio13 ejercicio = new Ejercicio13();
        ejercicio.leerTemperaturas();
        ejercicio.mostrarTemperaturas();
        System.out.println("Día con temperatura promedio más alta: Día " + (ejercicio.diaMayorPromedio() + 1));
        System.out.println("Día con temperatura promedio más baja: Día " + (ejercicio.diaMenorPromedio() + 1));
    }
}
