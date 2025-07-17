public class Ejercicio2_Diagonal {
    static int[][] diagonal= new int[5][5];
    
    public static void llenarMatriz(int[][]_diagonal){
        for (int f=0; f<_diagonal.length; f++) {
            for (int c=0; c<_diagonal[0].length; c++) {
                if (f==c) {
                    _diagonal[f][c]=1;
                }else{
                    _diagonal[f][c]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        llenarMatriz(diagonal);
        Ejercicio1_Sumas.ImprimirMatriz(diagonal);
    }
}
