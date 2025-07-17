public class Ejercicio3_Delimitacion {
    static int[][] marco = new int[5][15];

    public static void llenarMatriz(int[][] _marco) {
        for (int f = 0; f < _marco.length; f++) {
            for (int c = 0; c < _marco[0].length; c++) {
                if (f == 0 || c==0 || c==(_marco[0].length-1) || f==(_marco.length-1)) {
                    _marco[f][c] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        llenarMatriz(marco);
        Ejercicio1_Sumas.ImprimirMatriz(marco);
    }
}
