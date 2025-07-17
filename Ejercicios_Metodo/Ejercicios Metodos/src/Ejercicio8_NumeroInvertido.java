import java.util.Scanner;

public class Ejercicio8_NumeroInvertido {
    Scanner teclado= new Scanner(System.in);

    public void InvertirNumero(){
        System.out.println("Ingrese el numero: ");
        int numero=teclado.nextInt();
        while (numero>0) {
            int numero1=numero%10;
            System.out.print(numero1);
            numero=numero/10;
        }
    }

    public static void main(String[] args) {
        Ejercicio8_NumeroInvertido obj = new Ejercicio8_NumeroInvertido();
        obj.InvertirNumero();
    }
}
