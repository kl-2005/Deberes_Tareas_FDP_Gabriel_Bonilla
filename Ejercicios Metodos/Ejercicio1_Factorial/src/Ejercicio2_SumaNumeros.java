import java.util.Scanner;

public class Ejercicio2_SumaNumeros {
    public int num1,num2,num3,num4,num5;

    public void Suma(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        num1=teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        num2=teclado.nextInt();
        System.out.println("Ingrese el tercer número");
        num3=teclado.nextInt();
        System.out.println("Ingrese el cuarto número");
        num4=teclado.nextInt();
        System.out.println("Ingrese el quinto número");
        num5=teclado.nextInt();
    }

    public int Operacion(){
        int Suma;
        Suma=num1+num2+num3+num4+num5;
        return Suma;
    }

    public static void main(String[] args) {
        Ejercicio2_SumaNumeros obj = new Ejercicio2_SumaNumeros();
        obj.Suma();
        System.out.println(obj.Operacion());
    }

}
