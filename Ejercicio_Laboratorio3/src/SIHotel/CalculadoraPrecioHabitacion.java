package SIHotel;

import java.util.ArrayList;

public class CalculadoraPrecioHabitacion {

    public double calcularPrecio(Habitacion habitacion, Cliente cliente, String fecha, ArrayList<Promocion> promociones) {
        double precioBase = habitacion.getPrecio();
        double precioFinal = precioBase;

        if (promociones != null) {
            for (Promocion promo : promociones) {
                precioFinal = promo.aplicarDescuento(cliente, habitacion, precioFinal, fecha);
            }
        }

        return precioFinal;
    }
}
