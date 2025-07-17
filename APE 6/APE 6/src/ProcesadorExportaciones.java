import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class ProcesadorExportaciones {
    private static final List<String> norteAmerica = Arrays.asList("Mexico", "Estados Unidos", "Canada");

    // Ejercicio 1: cargar desde archivo CSV
    public static List<Exportacion> cargarDesdeArchivo(String rutaArchivo) {
        List<Exportacion> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            br.readLine(); // saltar encabezado si existe
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                // Asumiendo orden: pais,anio,mes,tipoProducto,montoMillonesDolares,pesoToneladas
                String pais = partes[0].trim();
                int anio = Integer.parseInt(partes[1].trim());
                String mes = partes[2].trim();
                String tipoProducto = partes[3].trim();
                double monto = Double.parseDouble(partes[4].trim());
                double peso = Double.parseDouble(partes[5].trim());

                Exportacion e = new Exportacion(anio, pais, anio, mes, tipoProducto, monto, peso);
                lista.add(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    // Ejercicio 2: guardar lista en archivo CSV
    public static void guardarEnArchivo(String rutaArchivo, List<Exportacion> lista) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaArchivo))) {
            // Escribir encabezado
            pw.println("pais,anio,mes,tipoProducto,montoMillonesDolares,pesoToneladas");
            for (Exportacion e : lista) {
                pw.printf("%s,%d,%s,%s,%.2f,%.2f\n",
                        e.getPais(),
                        e.getAnio(),
                        e.getMes(),
                        e.getTipoProducto(),
                        e.getMontoMillonesDolares(),
                        e.getPesoToneladas());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String paisNorteAmericaMasExporto(List<Exportacion> lista) {
        return lista.stream()
                .filter(e -> norteAmerica.contains(e.getPais()))
                .collect(Collectors.groupingBy(Exportacion::getPais, Collectors.summingDouble(Exportacion::getMontoMillonesDolares)))
                .entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("No encontrado");
    }

    public static void cantidadYMontosPorAnio(List<Exportacion> lista) {
        Map<Integer, List<Exportacion>> agrupado = lista.stream().collect(Collectors.groupingBy(Exportacion::getAnio));
        agrupado.forEach((anio, exportaciones) -> {
            int cantidad = exportaciones.size();
            double total = exportaciones.stream().mapToDouble(Exportacion::getMontoMillonesDolares).sum();
            System.out.println("Año: " + anio + " -> Cantidad: " + cantidad + ", Monto total: " + total);
        });
    }

    public static void porcentajeMontosPorSemestre(List<Exportacion> lista) {
        double total = lista.stream().mapToDouble(Exportacion::getMontoMillonesDolares).sum();

        Map<String, Double> semestres = new HashMap<>();
        for (Exportacion e : lista) {
            String mes = e.getMes().toLowerCase();
            String semestre = switch (mes) {
                case "enero", "febrero", "marzo", "abril", "mayo", "junio" -> "Primer semestre";
                case "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" -> "Segundo semestre";
                default -> "Desconocido";
            };
            semestres.put(semestre, semestres.getOrDefault(semestre, 0.0) + e.getMontoMillonesDolares());
        }

        semestres.forEach((sem, monto) -> {
            System.out.printf("%s: %.2f%%\n", sem, (monto / total) * 100);
        });
    }

    public static void promedioPesoPorProducto(List<Exportacion> lista) {
        List<Integer> anios = Arrays.asList(2022, 2023, 2024);
        Map<String, List<Exportacion>> agrupado = lista.stream()
                .filter(e -> anios.contains(e.getAnio()))
                .collect(Collectors.groupingBy(Exportacion::getTipoProducto));

        agrupado.forEach((producto, exportaciones) -> {
            double promedio = exportaciones.stream().mapToDouble(Exportacion::getPesoToneladas).average().orElse(0.0);
            System.out.println("Producto: " + producto + " -> Promedio Peso: " + promedio);
        });
    }
}
