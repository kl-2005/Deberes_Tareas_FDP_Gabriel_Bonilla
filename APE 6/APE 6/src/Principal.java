import java.util.*;

public class Principal {
    public static void main(String[] args) {
        String ruta = "src/ProductosExportacion (3).csv";
        List<Exportacion> lista = ExportacionDAO.cargarDesdeArchivo(ruta);

        List<Exportacion> listaExport = ProcesadorExportaciones.cargarDesdeArchivo("ProductosExportacion (3).csv");

        // 2. Mostrar país de Norteamérica con más exportaciones
        String paisTop = ProcesadorExportaciones.paisNorteAmericaMasExporto(listaExport);
        System.out.println("País de Norteamérica con más exportaciones: " + paisTop);

        System.out.println("\nEjercicio 3: País de Norteamérica con más exportaciones:");
        System.out.println("→ " + ProcesadorExportaciones.paisNorteAmericaMasExporto(lista));

        System.out.println("\nEjercicio 4: Cantidad y monto de productos por año:");
        ProcesadorExportaciones.cantidadYMontosPorAnio(lista);

        System.out.println("\nEjercicio 5: Porcentaje de monto por semestre:");
        ProcesadorExportaciones.porcentajeMontosPorSemestre(lista);

        System.out.println("\nEjercicio 6: Promedio de pesaje por producto (2022-2024):");
        ProcesadorExportaciones.promedioPesoPorProducto(lista);
    }
}
