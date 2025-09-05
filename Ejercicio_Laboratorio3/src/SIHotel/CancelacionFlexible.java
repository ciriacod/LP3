package SIHotel;

public class CancelacionFlexible implements PoliticaCancelacion {
    @Override
    public boolean puedeCancelar(Reserva reserva) {
        return true;
    }
    @Override
    public double calcularPenalidad(Reserva reserva) {
        return 0.0;
    }
}