package PMS;

import java.time.LocalDate;

public class ReservaController {
    private final GestorDisponibilidadHabitacion gestor;
    private final NotificadorReserva notificador;

    public ReservaController(GestorDisponibilidadHabitacion gestor, NotificadorReserva notificador) {
        this.gestor = gestor;
        this.notificador = notificador;
    }

    public Reserva crearReserva(String id, Habitacion habitacion, Cliente cliente,
                                LocalDate checkIn, LocalDate checkOut,
                                double precio, PoliticaCancelacion politica) {
        if (!habitacion.estaDisponible(checkIn, checkOut)) {
            System.out.println("Habitación no disponible.");
            return null;
        }
        Reserva reserva = new Reserva(id, habitacion, cliente, checkIn, checkOut, precio, politica);
        gestor.agregarReserva(reserva);
        notificador.notificarCliente(cliente, "Reserva creada con éxito: " + habitacion);
        return reserva;
    }

    public void cancelarReserva(Reserva reserva, LocalDate ahora) {
        ResultadoCancelacion resultado = reserva.cancelar(ahora);
        notificador.notificarCliente(reserva.getCliente(), resultado.getMensaje());
    }
}
