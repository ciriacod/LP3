package PMS;

public abstract class Habitacion {
    private final String numero;
    private final double precioBase;
    private GestorDisponibilidadHabitacion gestor;

    public Habitacion(String numero, double precioBase) {
        this.numero = numero;
        this.precioBase = precioBase;
    }

    public String getNumero() { return numero; }
    public double getPrecioBase() { return precioBase; }

    public void setGestorDisponibilidad(GestorDisponibilidadHabitacion gestor) {
        this.gestor = gestor;
    }

    public boolean estaDisponible(java.time.LocalDate desde, java.time.LocalDate hasta) {
        return gestor != null && gestor.verificarDisponibilidad(this, desde, hasta);
    }

    @Override
    public String toString() {
        return "Habitación " + numero + " (precio base: " + precioBase + ")";
    }
}
