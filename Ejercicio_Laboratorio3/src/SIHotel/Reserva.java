package SIHotel;

public class Reserva {
    private Habitacion habitacion;
    private Cliente cliente;
    private String fecha;
    private boolean activa;
    private PoliticaCancelacion politicaCancelacion;

    public Reserva(Habitacion habitacion, Cliente cliente, String fecha, PoliticaCancelacion politica) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fecha = fecha;
        this.activa = true;
        this.politicaCancelacion = politica;
    }
    
    public Reserva(Habitacion habitacion, Cliente cliente, String fecha) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fecha = fecha;
        this.activa = true;
    }

    public String getFecha() {
        return fecha;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean isActiva() {
        return activa;
    }

    public PoliticaCancelacion getPoliticaCancelacion() {
        return politicaCancelacion;
    }

    public boolean cancelar() {
        if (politicaCancelacion != null && politicaCancelacion.puedeCancelar(this)) {
            activa = false;
            double penalidad = politicaCancelacion.calcularPenalidad(this);
            if (penalidad > 0) {
                System.out.println("Se aplicó penalidad de: " + penalidad);
            }
            habitacion.liberarReserva(this);
            return true;
        }
        System.out.println("No se puede cancelar la reserva según la política.");
        return false;
    }
}
