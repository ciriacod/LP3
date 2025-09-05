package SIHotel;

public interface PoliticaCancelacion {
    boolean puedeCancelar(Reserva reserva);
    double calcularPenalidad(Reserva reserva);
}
