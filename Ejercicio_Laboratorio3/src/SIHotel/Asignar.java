package SIHotel;

public interface Asignar {
    void asignarHabitacion(Cliente cliente, Habitacion habitacion, String fecha);
    void liberarHabitacion(Habitacion habitacion);
}