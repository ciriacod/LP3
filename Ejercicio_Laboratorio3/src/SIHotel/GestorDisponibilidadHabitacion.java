package SIHotel;

import java.util.ArrayList;

public class GestorDisponibilidadHabitacion {
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public boolean estaDisponible(String fecha) {
        for (Reserva r : reservas) {
            if (r.getFecha().equals(fecha) && r.isActiva()) {
                return false;
            }
        }
        return true;
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void eliminarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
}
