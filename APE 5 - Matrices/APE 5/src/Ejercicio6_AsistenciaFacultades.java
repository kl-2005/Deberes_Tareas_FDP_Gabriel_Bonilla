import java.util.Random;

public class Ejercicio6_AsistenciaFacultades {

    static int[][] asistencia = new int[5][4]; // 5 materias, 4 facultades

    public static void llenarAsistenciaAleatoria() {
        Random rand = new Random();
        for (int f = 0; f < 5; f++)
            for (int c = 0; c < 4; c++)
                asistencia[f][c] = rand.nextInt(101);
    }

    public static void mostrarAsistenciaPorMateria() {
        System.out.println("\nAsistencia por materia:");
        for (int f = 0; f < 5; f++) {
            int suma = 0;
            for (int c = 0; c < 4; c++) suma += asistencia[f][c];
            System.out.println("Materia " + (f + 1) + ": " + suma);
        }
    }

    public static void mostrarAsistenciaFacultad3() {
        int total = 0;
        for (int f = 0; f < 5; f++) total += asistencia[f][2];
        System.out.println("\nAsistencia total en Facultad 3: " + total);
    }

    public static void mostrarAsistenciaEspecifica() {
        System.out.println("Asistencia en Materia 2, Facultad 1: " + asistencia[1][0]);
    }

    public static void mostrarPorcentajePorFacultad() {
        System.out.println("\nPorcentaje de asistencia por facultad:");
        for (int c = 0; c < 4; c++) {
            int suma = 0;
            for (int f = 0; f < 5; f++) suma += asistencia[f][c];
            double porcentaje = (double) suma / (5 * 100) * 100;
            System.out.printf("Facultad %d: %.2f%%\n", (c + 1), porcentaje);
        }
    }

    public static void mostrarFacultadMayorAsistencia() {
        int mayor = 0, facultad = -1;
        for (int c = 0; c < 4; c++) {
            int suma = 0;
            for (int f = 0; f < 5; f++) suma += asistencia[f][c];
            if (suma > mayor) {
                mayor = suma;
                facultad = c;
            }
        }
        System.out.println("Facultad con mayor asistencia: Facultad " + (facultad + 1));
    }

    public static void main(String[] args) {
        llenarAsistenciaAleatoria();
        mostrarAsistenciaPorMateria();
        mostrarAsistenciaFacultad3();
        mostrarAsistenciaEspecifica();
        mostrarPorcentajePorFacultad();
        mostrarFacultadMayorAsistencia();
    }
}
