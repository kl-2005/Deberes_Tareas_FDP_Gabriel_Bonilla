import java.util.Scanner;
/*bonilla_gabriel
03/05/2025 09:55 pm

*/
public class Credito_deber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de crédito:");
        System.out.println("1. Línea abierta");
        System.out.println("2. Hipotecario vivienda");
        System.out.println("3. Vivienda de interés público");
        System.out.println("4. Vivienda de interés social");
        System.out.println("5. Educación superior");
        int opcion = scanner.nextInt();
        double tasaInteresMensual;
        switch (opcion) {
            case 1: tasaInteresMensual = 0.015; 
            break;
            case 2: tasaInteresMensual = 0.012; 
            break;
            case 3: tasaInteresMensual = 0.010;
            break;
            case 4: tasaInteresMensual = 0.008; 
            break;
            case 5: tasaInteresMensual = 0.009; 
            break;
            default:
                System.out.println("Opción no válida.");
                return;
        }
        System.out.print("Ingrese el monto del crédito: ");
        double monto = scanner.nextDouble();
        System.out.print("Ingrese el plazo en meses: ");
        int meses = scanner.nextInt();
        double cuota = monto * (tasaInteresMensual * Math.pow(1 + tasaInteresMensual, meses)) /
                       (Math.pow(1 + tasaInteresMensual, meses) - 1);
        double saldo = monto;
        double totalInteres = 0;
        System.out.printf("\n%-5s %-12s %-12s %-15s %-15s\n", "Mes", "Cuota", "Interés", "Amortización", "Saldo restante");
        for (int mes = 1; mes <= meses; mes++) {
            double interes = saldo * tasaInteresMensual;
            double amortizacion = cuota - interes;
            saldo -= amortizacion;
            totalInteres += interes;
            System.out.printf("%-5d $%-11.2f $%-11.2f $%-14.2f $%-14.2f\n",
                              mes, cuota, interes, amortizacion, Math.max(saldo, 0));
        }
        double totalPagado = cuota * meses;
        System.out.printf("\n--- RESUMEN ---\n");
        System.out.printf("Cuota mensual fija: $%.2f\n", cuota);
        System.out.printf("Total pagado: $%.2f\n", totalPagado);
        System.out.printf("Total intereses: $%.2f\n", totalInteres);
        System.out.printf("Porcentaje de interés sobre el monto: %.2f%%\n", (totalInteres / monto) * 100);
    }
}
