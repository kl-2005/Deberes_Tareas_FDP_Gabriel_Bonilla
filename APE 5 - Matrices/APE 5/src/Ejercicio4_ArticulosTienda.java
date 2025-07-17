/* Sucursales columnas
 * Articulos Filas
 */

public class Ejercicio4_ArticulosTienda {
    static int[][] articulos = new int[5][4];
    static double[] precios = { 23.45, 87.99, 15.10, 42.75, 68.30 };
    static double[][] preciosG = new double[5][4];

    public static int sumasucursal2(int[][] _articulos) {
        int sumasucursal2 = 0;
        for (int c = 0; c < _articulos[0].length; c++) {
            for (int f = 0; f < _articulos.length; f++) {
                if (c == 1) {
                    sumasucursal2 = sumasucursal2 + _articulos[f][c];
                }
            }
        }
        return sumasucursal2;
    }

    public static void articuloSucursal3(int[][] _articulos) {
        int sucursal3 = 0;
        for (int c = 0; c < _articulos[0].length; c++) {
            for (int f = 0; f < _articulos.length; f++) {
                if (c == 0 && f == 2) {
                    System.out.println("Articulo " + (f + 1) + " en la sucursal " + (c + 1) + "=> " + _articulos[f][c]);
                }
            }
        }
    }

    public static double[][] precioCA(double[] _precios, int[][] _articulos, double[][] _preciosG) {
        int Sfilas;
        for (int f = 0; f < _articulos.length; f++) {
            Sfilas = 0;
            for (int c = 0; c < _articulos[0].length; c++) {
                _preciosG[f][c] = _articulos[f][c] * _precios[f];
            }
        }
        return _preciosG;
    }

    public static void ImprimirMatrizDouble(double[][] _matriz) {
        System.out.println("==================================");
        for (int f = 0; f < _matriz.length; f++) {
            for (int c = 0; c < _matriz[0].length; c++) {
                System.out.printf("$%.2f\t", _matriz[f][c]);
            }
            System.out.println();
        }
        System.out.println("==================================");
    }

    public static void RecaudacionTotal(double[][] _preciosG) {
        double Sumatoria=0;
        for (int f = 0; f < _preciosG.length; f++) {
            for (int c = 0; c < _preciosG[0].length; c++) {
                Sumatoria+=_preciosG[f][c];
            }
        }
        System.out.println("La recaudación total de la empresa es: "+Sumatoria);
    }

    public static void RecaudacionSucursal(double[][] _preciosG) {
        double Scolumnas = 0;
        for (int c = 0; c < _preciosG[0].length; c++) {
            Scolumnas=0;
            for (int f = 0; f <_preciosG.length; f++) {
                Scolumnas+=_preciosG[f][c];
            }
            System.out.println("Recaudación en Sucursal "+(c+1)+" es => "+Scolumnas);
        }
        
    }

    public static void RecaudacionMayor(double[][]_preciosG){
        double Scolumnas=0,mayor=0,columna = 0;
        for (int c = 0; c < _preciosG[0].length; c++) {
            Scolumnas=0;
            for (int f = 0; f <_preciosG.length; f++) {
                Scolumnas+=_preciosG[f][c];
            }
            if (mayor<Scolumnas) {
                    mayor=Scolumnas;
            }else{
                mayor=mayor;
            }
            columna=c+1;
        }
        System.out.println("La Sucursal de mayor recaudacion fue "+columna);
    }

    public static void main(String[] args) {
        Ejercicio1_Sumas.llenarMatriz(articulos);
        Ejercicio1_Sumas.ImprimirMatriz(articulos);
        System.out.println("Las cantidades de cada articulo son: ");
        Ejercicio1_Sumas.SumaFilas(articulos);
        System.out.println("Articulos en la sucursal 2 => " + sumasucursal2(articulos));
        articuloSucursal3(articulos);
        precioCA(precios, articulos, preciosG);
        ImprimirMatrizDouble(preciosG);
        RecaudacionSucursal(preciosG);
        RecaudacionTotal(preciosG);
        RecaudacionMayor(preciosG);
    }

}
