import java.util.Random;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        int dias = 5;
        double[][] temperaturas = new double[dias][3];

        CargarAleatoriaTemperaturas(temperaturas, 0, 18, 28); // Tmax
        CargarAleatoriaTemperaturas(temperaturas, 1, 8, 18);  // Tmin

        CalcularTemperaturaPromedio(temperaturas);

        ImprimirTemperaturas(temperaturas);

        encontrarValorMenor(temperaturas);
        encontrarValorMayor(temperaturas);
    }

    // Método para cargar temperaturas aleatorias en una columna específica
    private static void CargarAleatoriaTemperaturas(double[][] matriz, int columna, double limInf, double limSup) {
        Random rand = new Random();
        System.out.println("Carga Aleatoria de temperaturas en columna " + columna);
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][columna] = rand.nextDouble(limInf, limSup);
        }
    }

    // Método para carga manual (opcional)
    private static void CargarManualTemperaturas(double[][] matriz, int columna) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Carga manual de temperaturas en columna " + columna);
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Ingrese temperatura del día " + (i + 1) + ": ");
            matriz[i][columna] = teclado.nextDouble();
        }
    }

    // Calcular promedio entre Tmax y Tmin
    private static void CalcularTemperaturaPromedio(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][2] = (matriz[i][0] + matriz[i][1]) / 2;
        }
    }

    // Imprimir los valores de la matriz
    private static void ImprimirTemperaturas(double[][] matriz) {
        System.out.println("Día\tTmax\tTmin\tTmedia");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println((i + 1) + "\t" + matriz[i][0] + "\t" + matriz[i][1] + "\t" + matriz[i][2]);
        }
    }

    // Encontrar el valor menor en la columna Tmedia
    public static void encontrarValorMenor(double[][] matriz) {
        double menor = matriz[0][2];
        int dia = 1;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][2] < menor) {
                menor = matriz[i][2];
                dia = i + 1;
            }
        }
        System.out.println("El valor menor de Tmedia es " + menor + " en el día " + dia);
    }

    // Encontrar el valor mayor en la columna Tmedia
    public static void encontrarValorMayor(double[][] matriz) {
        double mayor = matriz[0][2];
        int dia = 1;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][2] > mayor) {
                mayor = matriz[i][2];
                dia = i + 1;
            }
        }
        System.out.println("El valor mayor de Tmedia es " + mayor + " en el día " + dia);
    }
}
