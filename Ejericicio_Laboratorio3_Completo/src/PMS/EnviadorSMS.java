package PMS;

public class EnviadorSMS implements CanalNotificacion {
    @Override
    public void enviarNotificacion(String destino, String mensaje) {
        System.out.println("[SMS -> " + destino + "] " + mensaje);
    }
}
