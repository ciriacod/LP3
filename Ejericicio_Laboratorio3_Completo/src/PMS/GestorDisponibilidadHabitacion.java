package PMS;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorDisponibilidadHabitacion {
    private final List<Reserva> reservas;

    public GestorDisponibilidadHabitacion() {
        this.reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public boolean verificarDisponibilidad(Habitacion habitacion, LocalDate desde, LocalDate hasta) {
        for (Reserva r : reservas) {
            if (r.getHabitacion().equals(habitacion) && r.getEstado() == EstadoReserva.CONFIRMADA) {
                if (!(hasta.isBefore(r.getCheckIn()) || desde.isAfter(r.getCheckOut()))) {
                    return false;
                }
            }
        }
        return true;
    }
}
