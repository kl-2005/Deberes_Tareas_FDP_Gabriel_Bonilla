import java.util.Scanner;

public class Ejercicio1_Factorial {
    public int num,fact=1;

    public int CalcularFactorial(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número para calcular su fcatorial");
        num=teclado.nextInt();
        for (int i=1; i<=num ; i++) {
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) throws Exception {
        Ejercicio1_Factorial numero1 = new Ejercicio1_Factorial();
        System.out.println(numero1.CalcularFactorial());    
    }
}
