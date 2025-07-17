import java.util.Scanner;

public class Ejercicio7_FormaDePago {
    Scanner teclado = new Scanner(System.in);

    public double recargo(char tipoPago) {
        if (tipoPago == 'P') return 0.10;
        return 0.0;
    }

    public double descuento(char tipoCliente) {
        if (tipoCliente == 'A') return 0.15;
        return 0.0;
    }

    
    public void calcularTotal() {
        System.out.print("Ingrese tipo de Cliente (A o G): ");
        char tipoCliente = teclado.next().charAt(0);
        System.out.print("Ingrese monto: ");
        double monto = teclado.nextDouble();
        System.out.print("Ingrese tipo de Pago (C o P): ");
        char tipoPago = teclado.next().charAt(0);
        double desc = monto * descuento(tipoCliente);
        double rec = monto * recargo(tipoPago);
        double total = monto - desc + rec;
        System.out.println("Descuento: " + desc);
        System.out.println("Recargo: " + rec);
        System.out.println("Total a pagar: " + total);
    }

    public static void main(String[] args) {
        Ejercicio7_FormaDePago obj = new Ejercicio7_FormaDePago();
        obj.calcularTotal(); 
    }
}
