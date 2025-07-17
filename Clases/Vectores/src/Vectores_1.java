public class Vectores_1 {

    public static void main(String[] args) {
        //Temperatura maxima de la semana
        double[] Tmax = {18,20,24,17,26};
        //Temperatura minima de la semana
        double[] Tmin = {7,9,8,5,11};

        double[] Tmedia = new double[5];

        for (int i = 0; i < Tmedia.length; i++) {
            Tmedia[i]=(Tmax[i]+Tmin[i])/2;
        }

        System.out.println("T. Max "+" T. min "+ " T. Media ");
        for (int i = 0; i < Tmedia.length; i++) {
            System.out.println(Tmax[i]+"\t"+Tmin[i]+"\t"+Tmedia[i]);
        }

        //Pregunta 2
        double valorMenor=Tmedia[0];
        int posicion = 0;

        for (int i = 0; i < Tmedia.length; i++) {
            if (valorMenor>Tmedia[i]) {
                valorMenor=Tmedia[i];
                posicion=i+1;
            }
        }
        System.out.println("El valor menor es "+valorMenor+" en el dia "+posicion);

        //Pregunta 3
        double valorMayor=Tmedia[0];
        int pos_1 = 0;

        for (int i = 0; i < Tmedia.length; i++) {
            if (valorMenor<Tmedia[i]) {
                valorMenor=Tmedia[i];
                pos_1=i;
            }
        }
        pos_1++;
        System.out.println("El valor mayor es "+valorMenor+" en el dia "+posicion);


    }
}
