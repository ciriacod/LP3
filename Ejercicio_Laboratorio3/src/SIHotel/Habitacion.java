package SIHotel;

import java.util.ArrayList;

public abstract class Habitacion implements IManejoReservas {
    private double precio;
    private String cuarto;
    private String tipo;
    private GestorDisponibilidadHabitacion gestorDisponibilidad;

    public Habitacion(double precio, String cuarto, String tipo){
        this.precio = precio;
        this.cuarto = cuarto;
        this.tipo = tipo;
        this.gestorDisponibilidad = new GestorDisponibilidadHabitacion();
    }
    
    public String getTipo() {
        return this.tipo;
    }
    public double getPrecio() {
        return this.precio;
    }
    public String getCuarto() {
        return this.cuarto;
    }

    @Override
    public void addReserva(Reserva reserva) {
        gestorDisponibilidad.agregarReserva(reserva);
    }

    public ArrayList<Reserva> getReservas() {
        return gestorDisponibilidad.getReservas();
    }

    public boolean estaDisponibleEnFecha(String fecha) {
        return gestorDisponibilidad.estaDisponible(fecha);
    }

    public void liberarReserva(Reserva reserva) {
        gestorDisponibilidad.eliminarReserva(reserva);
    }
}