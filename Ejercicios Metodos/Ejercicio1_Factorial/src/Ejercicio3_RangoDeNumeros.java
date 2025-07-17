import java.util.Scanner;

public class Ejercicio3_RangoDeNumeros {
    public int Rinicial,Rfinal;
    public Scanner teclado;
    public String opc;

    public void IngresoRango(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el rango inicial");
        Rinicial=teclado.nextInt();
        System.out.println("Ingrese el rango final");
        Rfinal=teclado.nextInt();
    }

    public double PromedioTotal(){
        int total=0;
        double dif=(Rfinal-Rinicial)+1;
        for (int i=Rinicial; i<=Rfinal; i++){
            total+=i;
        }
        double promedioT=total/dif;
        return promedioT;
    }
    
    public double PromedioPares(){
        int total=0;double dif=0;
        for (int i=Rinicial; i<=Rfinal; i++){
            if(i%2==0){
                total+=i;   
                dif+=1;
            }
        }
        double promedioP=total/dif;
        return promedioP;
    }

    public double PromedioImpares(){
        int total=0;double dif=0;
        for (int i=Rinicial; i<=Rfinal; i++){
            if(i%2==1){
                total+=i;   
                dif+=1;
            }
        }
        double promedioI=total/dif;
        return promedioI;
    }

    public double PromedioPrimos(){
        int total=0;double dif=0;
        for (int i = Rinicial; i <= Rfinal; i++) {
            boolean esPrimo = true;
            if (i < 2) {
                esPrimo = false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                total += i;
                dif += 1;
            }
        }
        if (dif == 0) {
            System.out.println("No hay números primos en el rango.");
            return 0;
        }
        double promedioPR = total / dif;
        return promedioPR;
    }
   
    public static void main(String[] args) {
        Ejercicio3_RangoDeNumeros obj = new Ejercicio3_RangoDeNumeros();
        obj.opc="Si";
        while (obj.opc.equalsIgnoreCase("si")) {
            obj.IngresoRango();
            System.out.println("El Promedio de todos los números es: " + obj.PromedioTotal());
            System.out.println("El Promedio de los pares es: " + obj.PromedioPares());
            System.out.println("El Promedio de los impares es: " + obj.PromedioImpares());
            System.out.println("El Promedio de los primos es: " + obj.PromedioPrimos());   
            System.out.println("Desea volver a Ingresar otro rango");
            System.out.println("S/N");
            obj.opc=obj.teclado.next();
        }
    }
}
