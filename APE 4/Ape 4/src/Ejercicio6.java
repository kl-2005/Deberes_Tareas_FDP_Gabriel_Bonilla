import java.util.Arrays;

public class Ejercicio6 {

    public static void main(String[] args) {
        String[] coches = inicializarCoches();
        ordenarMarcas(coches);
        mostrarMarcas(coches);
    }

    public static String[] inicializarCoches() {
        String[] coches = new String[8];
        coches[0] = "Alfa Romeo";
        coches[1] = "Fiat";
        coches[2] = "Ford";
        coches[3] = "Lancia";
        coches[4] = "Renault";
        coches[5] = "Seat";
        coches[6] = "Opel";
        coches[7] = "Citroen";
        return coches;
    }

    public static void ordenarMarcas(String[] marcas) {
        Arrays.sort(marcas);
    }

    public static void mostrarMarcas(String[] marcas) {
        System.out.println("Marcas ordenadas:");
        for (String marca : marcas) {
            System.out.println(marca);
        }
    }
}

