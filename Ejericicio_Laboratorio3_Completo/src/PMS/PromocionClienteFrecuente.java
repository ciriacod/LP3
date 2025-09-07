package PMS;

import java.time.LocalDate;

public class PromocionClienteFrecuente implements Promocion {
    private final double descuento;

    public PromocionClienteFrecuente(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double aplicar(Habitacion habitacion, LocalDate fecha, double precioBase) {
        return precioBase * (1 - descuento);
    }
}
