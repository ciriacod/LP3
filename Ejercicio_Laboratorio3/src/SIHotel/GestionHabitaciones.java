package SIHotel;

import java.util.ArrayList;

public class GestionHabitaciones implements ConsultaHabitacion, Asignar {
    private ArrayList<Habitacion> habitaciones = new ArrayList<>();

    public void registrarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    @Override
    public void asignarHabitacion(Cliente cliente, Habitacion habitacion, String fecha) {
        Reserva reserva = new Reserva(habitacion, cliente, fecha);
        cliente.addReserva(reserva);
        habitacion.addReserva(reserva);
    }

    @Override
    public void liberarHabitacion(Habitacion habitacion) {
        for (Reserva r : habitacion.getReservas()) {
            if (r.isActiva()) {
                r.cancelar();
            }
        }
    }

    @Override
    public ArrayList<Habitacion> consultarHabitaciones() {
        return habitaciones;
    }

    @Override
    public String consultarHabitacion(Habitacion habitacionConsultada) {
        return "Habitación: " + habitacionConsultada.getCuarto() +
               "Tipo: " + habitacionConsultada.getTipo() +
               "Precio: " + habitacionConsultada.getPrecio();
    }
}
