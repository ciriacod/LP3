package SIHotel;

import java.util.ArrayList;

public interface ConsultaHabitacion {
    ArrayList<Habitacion> consultarHabitaciones();
    String consultarHabitacion(Habitacion habitacionConsultada);
}
