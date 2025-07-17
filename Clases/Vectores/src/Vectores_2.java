import java.util.Random;
import java.util.Scanner;

public class Vectores_2 {

    public static void main(String[] args) {
        //Temperatura maxima de la semana
        double[] Tmax = {18,20,24,17,26};
        //Temperatura minima de la semana
        double[] Tmin = {7,9,8,5,11};

        double[] Tmedia = new double[5];

        CargaAleatoriaTemperaturas(Tmax, 18, 28);
        CargaAleatoriaTemperaturas(Tmin, 8, 18);


        Calculartemperaturapromedio(Tmax, Tmin, Tmedia);

        Imprimirvectoresdetemperatura(Tmax, Tmin, Tmedia);

        encontrarValorMenor(Tmedia);
        encontrarValorMayor(Tmedia);


    }

    public static void encontrarValorMenor(double[] Tmedia) {
        double valorMenor = Tmedia[0];
        int posicion = 0;
        for (int i = 0; i < Tmedia.length; i++) {
            if (valorMenor > Tmedia[i]) {
                valorMenor = Tmedia[i];
                posicion = i + 1;
            }
        }
        System.out.println("El valor menor es " + valorMenor + " en el día " + posicion);
    }

    public static void encontrarValorMayor(double[] Tmedia) {
        double valorMayor = Tmedia[0];
        int posicion = 0;

        for (int i = 0; i < Tmedia.length; i++) {
            if (valorMayor < Tmedia[i]) {
                valorMayor = Tmedia[i];
                posicion = i + 1;
            }
        }
        System.out.println("El valor mayor es " + valorMayor + " en el día " + posicion);
    }

    private static void Imprimirvectoresdetemperatura(double[] Tmax, double[] Tmin, double[] Tmedia) {
        System.out.println("T. Max "+" T. min "+ " T. Media ");
        for (int i = 0; i < Tmedia.length; i++) {
            System.out.println(Tmax[i]+"\t"+Tmin[i]+"\t"+Tmedia[i]);
        }
    }

    private static void Calculartemperaturapromedio(double[] Tmax, double[] Tmin, double[] Tmedia) {
        for (int i = 0; i < Tmedia.length; i++) {
            Tmedia[i]=(Tmax[i]+Tmin[i])/2;
        }
    }
    
        private static void CargaAleatoriaTemperaturas(double[] Vector, double limiteInferior, double limiteSuperior){
        Random aleatorio = new Random();
        System.out.println("Carga Aleatoria de temperaturas");
        for (int i = 0; i < Vector.length; i++) {
            Vector[i] = aleatorio.nextDouble(limiteInferior, limiteSuperior);
        }
    }

    private static void CargaManualTemperaturas(double[] Vector){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Carga manual de temperaturas");
        for (int i = 0; i < Vector.length; i++) {
            System.out.print("Ingrese la Temperatura: ");
            Vector[i] = teclado.nextDouble();
        }
    }

}
