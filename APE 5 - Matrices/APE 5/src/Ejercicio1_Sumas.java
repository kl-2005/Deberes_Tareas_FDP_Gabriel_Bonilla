import java.util.Random;

public class Ejercicio1_Sumas {
    static int [][] matriz= new int[5][5];
    static Random random = new Random();

    public static void llenarMatriz(int[][] _matriz){
        for (int f=0; f<_matriz.length; f++) {
            for (int c = 0; c < _matriz[0].length; c++) {
                _matriz[f][c]=random.nextInt(1,20);
            }
        }
    }

    public static void ImprimirMatriz(int[][]_matriz){
        System.out.println("==================================");
        for (int f=0; f<_matriz.length; f++) {
            for (int c = 0; c < _matriz[0].length; c++) {
                System.out.print(_matriz[f][c]+"\t");
            }
            System.out.println("");
        }
        System.out.println("==================================");
    }

    public static void SumaColumnas(int[][]_matriz){
        int Scolumnas;
        for (int c=0; c<_matriz.length; c++) {
            Scolumnas=0;
            for (int f = 0; f < _matriz[0].length; f++) {
                Scolumnas+=_matriz[f][c];
            }
            System.out.println("Suma columna "+(c+1)+" => "+Scolumnas);
        }
    }

    public static void SumaFilas(int[][]_matriz){
        int Sfilas;
        for (int f=0; f<_matriz.length; f++) {
            Sfilas=0;
            for (int c = 0; c < _matriz[0].length; c++) {
                Sfilas+=_matriz[f][c];
            }
            System.out.println("Fila "+(f+1)+" => "+Sfilas);
        }
    }

    public static void main(String[] args) throws Exception {
        llenarMatriz(matriz);
        ImprimirMatriz(matriz);
        SumaColumnas(matriz);
        SumaFilas(matriz);
    }
}
