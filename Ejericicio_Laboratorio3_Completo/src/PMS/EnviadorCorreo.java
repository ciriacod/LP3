package PMS;

public class EnviadorCorreo implements CanalNotificacion {
    @Override
    public void enviarNotificacion(String destino, String mensaje) {
        System.out.println("[EMAIL -> " + destino + "] " + mensaje);
    }
}
