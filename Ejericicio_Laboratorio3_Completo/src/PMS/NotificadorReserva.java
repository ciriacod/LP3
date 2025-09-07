package PMS;

public class NotificadorReserva {
    private final CanalNotificacion canal;

    public NotificadorReserva(CanalNotificacion canal) {
        this.canal = canal;
    }

    public void notificarCliente(Cliente cliente, String mensaje) {
        canal.enviarNotificacion(cliente.getEmail(), mensaje);
    }
}
