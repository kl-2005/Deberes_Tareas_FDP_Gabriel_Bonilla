import java.util.Scanner;

public class Ejercicio3_EtapaVida {
    Scanner teclado = new Scanner(System.in);

    public void etapa() {
        String etapa="";
        System.out.println("Ingrese su edad: ");
        int edad=teclado.nextInt();
        if (edad >= 0) {
            if (edad <= 2) {
                etapa = "Bebé";
            } else {
                if (edad <= 5) {
                    etapa = "Niño";
                } else {
                    if (edad <= 12) {
                        etapa = "Pubertad";
                    } else {
                        if (edad <= 18) {
                            etapa = "Adolescente";
                        } else {
                            if (edad <= 25) {
                                etapa = "Joven";
                            } else {
                                if (edad <= 60) {
                                    etapa = "Adulto";
                                } else {
                                    etapa = "Anciano";
                                }
                            }
                        }
                    }
                }
            }
        } else {
            etapa = "Edad inválida";
        }
        System.out.println("Etapa: " + etapa);
    }

    public static void main(String[] args) {
        Ejercicio3_EtapaVida obj = new Ejercicio3_EtapaVida();
        obj.etapa();
    }
}
