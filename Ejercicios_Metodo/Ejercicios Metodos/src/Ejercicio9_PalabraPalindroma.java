import java.util.Scanner;

public class Ejercicio9_PalabraPalindroma {
    Scanner teclado = new Scanner(System.in);
    public String palabra;

    public void GirarPalabra(){
        System.out.println("Ingrese la palabra a verificar");
        String palabra = teclado.next();
        palabra=palabra.toLowerCase();
        String invertida = new StringBuilder(palabra).reverse().toString();
        System.out.println(invertida);
        if (palabra.equals(invertida)) {
            System.out.println("Palabra palindroma");
        }else{
            System.out.println("No es palindroma");
        }
    }

    public static void main(String[] args) {
        Ejercicio9_PalabraPalindroma obj = new Ejercicio9_PalabraPalindroma();
        obj.GirarPalabra();
    }

}
