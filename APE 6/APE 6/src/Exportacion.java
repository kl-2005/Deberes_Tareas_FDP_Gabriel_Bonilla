public class Exportacion {
    private int id;
    private String mes;
    private int anio;
    String pais;
    private String tipoProducto;
    private double pesoToneladas;
    private double montoMillonesDolares;

    public Exportacion(int id, String mes, int anio, String pais, String tipoProducto, double pesoToneladas, double montoMillonesDolares) {
        this.id = id;
        this.mes = mes;
        this.anio = anio;
        this.pais = pais;
        this.tipoProducto = tipoProducto;
        this.pesoToneladas = pesoToneladas;
        this.montoMillonesDolares = montoMillonesDolares;
    }

    public String toCSV() {
        return id + "," + mes + "," + anio + "," + pais + "," + tipoProducto + "," + pesoToneladas + "," + montoMillonesDolares;
    }

    // Getters (opcional para otros ejercicios)
    public int getId() { return id; }
    public String getMes() { return mes; }
    public int getAnio() { return anio; }
    public String getPais() { return pais; }
    public String getTipoProducto() { return tipoProducto; }
    public double getPesoToneladas() { return pesoToneladas; }
    public double getMontoMillonesDolares() { return montoMillonesDolares; }
}
