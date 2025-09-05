package SIHotel;

public class CancelacionConPenalidad implements PoliticaCancelacion {
    private double penalidad;
    public CancelacionConPenalidad(double penalidad) {
        this.penalidad = penalidad;
    }
    @Override
    public boolean puedeCancelar(Reserva reserva) {
        return true;
    }
    @Override
    public double calcularPenalidad(Reserva reserva) {
        return penalidad;
    }
}