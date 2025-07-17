import java.io.*;
import java.util.*;

public class ExportacionDAO {
    public static List<Exportacion> cargarDesdeArchivo(String ruta) {
        List<Exportacion> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea = br.readLine(); // Saltar encabezado
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length >= 7) {
                    int id = Integer.parseInt(partes[0]);
                    String mes = partes[1];
                    int anio = Integer.parseInt(partes[2]);
                    String pais = partes[3];
                    String tipo = partes[4];
                    double peso = Double.parseDouble(partes[5]);
                    double monto = Double.parseDouble(partes[6]);
                    lista.add(new Exportacion(id, mes, anio, pais, tipo, peso, monto));
                }
            }
        } catch (Exception e) {
            System.err.println("Error al leer archivo: " + e.getMessage());
        }
        return lista;
    }

    public static void guardarEnArchivo(String ruta, Exportacion exp) {
        try (FileWriter fw = new FileWriter(ruta, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(exp.toString());
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error al guardar: " + e.getMessage());
        }
    }
}
