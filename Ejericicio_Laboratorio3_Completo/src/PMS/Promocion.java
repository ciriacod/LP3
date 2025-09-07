package PMS;

import java.time.LocalDate;

public interface Promocion {
    double aplicar(Habitacion habitacion, LocalDate fecha, double precioBase);
}
