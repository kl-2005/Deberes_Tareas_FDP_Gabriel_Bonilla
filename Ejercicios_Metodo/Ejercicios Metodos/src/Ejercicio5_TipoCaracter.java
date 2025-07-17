import java.util.Scanner;

public class Ejercicio5_TipoCaracter {
    Scanner teclado = new Scanner(System.in);

    public void tipoCaracter() {
        System.out.println("Ingrese su caracter");
        char c = teclado.next().charAt(0);
        if (Character.isLetter(c)) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.println("Es una vocal");
            } else {
                if (Character.isUpperCase(c)) {
                    System.out.println("Es una letra mayúscula");
                } else {
                    System.out.println("Es una letra minúscula");
                }
            }
        } else {
            if (Character.isDigit(c)) {
                System.out.println("Es un número");
            } else {
                System.out.println("Es un símbolo");
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio5_TipoCaracter obj = new Ejercicio5_TipoCaracter();
        obj.tipoCaracter();
    }

}
