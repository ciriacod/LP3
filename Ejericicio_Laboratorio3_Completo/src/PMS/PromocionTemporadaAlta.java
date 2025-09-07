package PMS;

import java.time.LocalDate;

public class PromocionTemporadaAlta implements Promocion {
    private final LocalDate desde;
    private final LocalDate hasta;
    private final double incremento;

    public PromocionTemporadaAlta(LocalDate desde, LocalDate hasta, double incremento) {
        this.desde = desde;
        this.hasta = hasta;
        this.incremento = incremento;
    }

    @Override
    public double aplicar(Habitacion habitacion, LocalDate fecha, double precioBase) {
        if ((fecha.isEqual(desde) || fecha.isAfter(desde)) &&
            (fecha.isEqual(hasta) || fecha.isBefore(hasta))) {
            return precioBase * (1 + incremento);
        }
        return precioBase;
    }
}
