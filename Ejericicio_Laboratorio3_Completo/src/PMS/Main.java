package PMS;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear gestor de disponibilidad
        GestorDisponibilidadHabitacion gestor = new GestorDisponibilidadHabitacion();

        // Crear notificador por correo
        NotificadorReserva notificador = new NotificadorReserva(new EnviadorCorreo());

        // Crear controlador
        ReservaController controller = new ReservaController(gestor, notificador);

        // Cliente
        Cliente cliente = new Cliente("1", "Juan Pérez", "juan@example.com", "987654321");

        // Habitaciones
        Habitacion habitacion1 = new HabitacionEstandar("101", 100);
        habitacion1.setGestorDisponibilidad(gestor);

        Habitacion habitacion2 = new Suite("201", 250);
        habitacion2.setGestorDisponibilidad(gestor);

        // Precio con promociones
        CalculadoraPrecioHabitacion calc = new CalculadoraPrecioHabitacion(Arrays.asList(
                new PromocionTemporadaAlta(LocalDate.of(2025, 12, 15),
                                           LocalDate.of(2026, 1, 10),
                                           0.3),
                new PromocionClienteFrecuente(0.1)
        ));

        double precio = calc.calcularPrecio(habitacion1, LocalDate.of(2025, 12, 20));

        // Crear reserva con política moderada
        Reserva reserva = controller.crearReserva(
                "R001", habitacion1, cliente,
                LocalDate.of(2025, 12, 20),
                LocalDate.of(2025, 12, 25),
                precio,
                new PoliticaCancelacionModerada()
        );

        if (reserva != null) {
            System.out.println("Reserva creada con precio final: " + reserva.getPrecioTotal());

            // Intentar cancelar
            controller.cancelarReserva(reserva, LocalDate.of(2025, 12, 18));
        }
    }
}
