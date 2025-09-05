package SIHotel;

public class PromocionClientesVIP implements Promocion {
    private double descuento;

    public PromocionClientesVIP(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double aplicarDescuento(Cliente cliente, Habitacion habitacion, double precioBase, String fecha) {
        if (cliente.isVIP()) {
            return precioBase * (1 - descuento);
        }
        return precioBase;
    }
}
