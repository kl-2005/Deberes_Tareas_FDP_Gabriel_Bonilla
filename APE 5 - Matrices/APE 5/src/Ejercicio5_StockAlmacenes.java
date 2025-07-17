import java.util.Random;

public class Ejercicio5_StockAlmacenes {

    static int[][] stock = new int[8][3];
    static double[] precios = {100, 200, 50, 40, 80, 100, 60, 50};

    public static void llenarStockAleatorio() {
        Random rand = new Random();
        for (int f = 0; f < stock.length; f++) {
            for (int c = 0; c < stock[0].length; c++) {
                stock[f][c] = rand.nextInt(50) + 1;
            }
        }
    }

    public static void mostrarStock() {
        System.out.println("Stock de productos en almacenes:");
        for (int f = 0; f < stock.length; f++) {
            System.out.print("Producto " + (f + 1) + ": ");
            for (int c = 0; c < stock[0].length; c++) {
                System.out.print(stock[f][c] + "\t");
            }
            System.out.println();
        }
    }

    public static void mostrarInventarioPorProducto() {
        System.out.println("\nInventario total por producto:");
        for (int f = 0; f < stock.length; f++) {
            int suma = 0;
            for (int c = 0; c < stock[0].length; c++) suma += stock[f][c];
            System.out.println("Producto " + (f + 1) + ": " + suma);
        }
    }

    public static void mostrarInventarioAlmacen1() {
        int total = 0;
        for (int f = 0; f < stock.length; f++) total += stock[f][0];
        System.out.println("\nInventario total en almacén 1: " + total);
    }

    public static void mostrarStockProducto4Almacen2() {
        System.out.println("Stock del producto 4 en almacén 2: " + stock[3][1]);
    }

    public static void mostrarValorTotalInventario() {
        double total = 0;
        for (int f = 0; f < stock.length; f++)
            for (int c = 0; c < stock[0].length; c++)
                total += stock[f][c] * precios[f];
        System.out.printf("\nValor total del inventario: $%.2f\n", total);
    }

    public static void mostrarAlmacenConMasProductos() {
        int max = 0, pos = -1;
        for (int c = 0; c < 3; c++) {
            int suma = 0;
            for (int f = 0; f < 8; f++) suma += stock[f][c];
            if (suma > max) {
                max = suma;
                pos = c;
            }
        }
        System.out.println("Almacén con más productos: Almacén " + (pos + 1));
    }

    public static void main(String[] args) {
        llenarStockAleatorio();
        mostrarStock();
        mostrarInventarioPorProducto();
        mostrarInventarioAlmacen1();
        mostrarStockProducto4Almacen2();
        mostrarValorTotalInventario();
        mostrarAlmacenConMasProductos();
    }
}
