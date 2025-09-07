package PMS;

public class ResultadoCancelacion {
    private boolean puede;
    private double penalizacion;
    private String mensaje;

    public ResultadoCancelacion(boolean puede, double penalizacion, String mensaje) {
        this.puede = puede;
        this.penalizacion = penalizacion;
        this.mensaje = mensaje;
    }

    public boolean isPuede() { return puede; }
    public double getPenalizacion() { return penalizacion; }
    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
}
