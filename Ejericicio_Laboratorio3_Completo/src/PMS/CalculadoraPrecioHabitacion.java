package PMS;

import java.time.LocalDate;
import java.util.List;

public class CalculadoraPrecioHabitacion {
    private final List<Promocion> promociones;

    public CalculadoraPrecioHabitacion(List<Promocion> promociones) {
        this.promociones = promociones;
    }

    public double calcularPrecio(Habitacion habitacion, LocalDate fecha) {
        double precioBase = habitacion.getPrecioBase();
        for (Promocion p : promociones) {
            precioBase = p.aplicar(habitacion, fecha, precioBase);
        }
        return precioBase;
    }
}
