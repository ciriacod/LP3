package PMS;

import java.time.LocalDate;

public class Reserva {
    private final String id;
    private final Habitacion habitacion;
    private final Cliente cliente;
    private final LocalDate checkIn;
    private final LocalDate checkOut;
    private double precioTotal;
    private PoliticaCancelacion politica;
    private EstadoReserva estado;

    public Reserva(String id, Habitacion habitacion, Cliente cliente,
                   LocalDate checkIn, LocalDate checkOut,
                   double precioTotal, PoliticaCancelacion politica) {
        this.id = id;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.precioTotal = precioTotal;
        this.politica = politica;
        this.estado = EstadoReserva.CONFIRMADA;
    }

    public String getId() { return id; }
    public Habitacion getHabitacion() { return habitacion; }
    public Cliente getCliente() { return cliente; }
    public LocalDate getCheckIn() { return checkIn; }
    public LocalDate getCheckOut() { return checkOut; }
    public double getPrecioTotal() { return precioTotal; }
    public EstadoReserva getEstado() { return estado; }

    public ResultadoCancelacion cancelar(LocalDate ahora) {
        if (estado == EstadoReserva.CANCELADA) {
            return new ResultadoCancelacion(false, 0.0, "Reserva ya cancelada.");
        }
        ResultadoCancelacion r = politica.puedeCancelar(this, ahora);
        if (r.isPuede()) {
            double penalizacion = r.getPenalizacion();
            if (penalizacion > 0) {
                double montoPenal = precioTotal * penalizacion;
                precioTotal -= montoPenal;
                r.setMensaje(r.getMensaje() + String.format(" Penalización aplicada: %.2f", montoPenal));
            }
            estado = EstadoReserva.CANCELADA;
        }
        return r;
    }
}
