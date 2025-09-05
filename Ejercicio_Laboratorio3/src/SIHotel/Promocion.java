package SIHotel;

public interface Promocion {
    double aplicarDescuento(Cliente cliente, Habitacion habitacion, double precioBase, String fecha);
}
