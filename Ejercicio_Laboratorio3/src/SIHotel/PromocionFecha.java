package SIHotel;

public class PromocionFecha implements Promocion {
    private String fechaPromo;
    private double descuento;
    public PromocionFecha(String fechaPromo, double descuento) {
        this.fechaPromo = fechaPromo;
        this.descuento = descuento;
    }
    @Override
    public double aplicarDescuento(Cliente cliente, Habitacion habitacion, double precioBase, String fecha) {
        if (fecha.equals(fechaPromo)) {
            return precioBase * (1 - descuento);
        }
        return precioBase;
    }
}