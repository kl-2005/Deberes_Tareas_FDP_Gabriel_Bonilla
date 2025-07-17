import java.util.Scanner;

public class Ejercicio4_Frase {
    public String Frase;
    public Scanner teclado;
    
    public void IngresarFrase(){
        teclado= new Scanner(System.in);
        System.out.println("Ingrese su Frase");
        Frase=teclado.nextLine();
    }

    public int CantidadCaracteres(){    
        int longitud=Frase.length();
        return longitud;
    }

    public int CantidadPalabras(){
        int palabras=0;
        for (int i = 0; i<Frase.length(); i++) {
        if (Frase.charAt(i) == ' ') {
            palabras++;
        }
    }
    if (!Frase.isBlank()) {
        palabras++;
    }
        return palabras;
    }

    public int CantidadVocales(){
        int vocales=0;
            for (int i = 0; i < Frase.length(); i++) {
            char c = Character.toLowerCase(Frase.charAt(i));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
        }
        return vocales;
    }

    public static void main(String[] args) {
        Ejercicio4_Frase obj=new Ejercicio4_Frase();
        obj.IngresarFrase();
        System.out.println("Cantidad de Palabras es: "+obj.CantidadPalabras());
        System.out.println("Cantidad de Letras es: "+obj.CantidadCaracteres());
        System.out.println("Cantidad de Voales es: "+obj.CantidadVocales());
    }
}
