package SIHotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GestionClientes gestionClientes = new GestionClientes();
        GestionHabitaciones gestionHabitaciones = new GestionHabitaciones();
        GestionPersonal gestionPersonal = new GestionPersonal();
        CalculadoraPrecioHabitacion calculadora = new CalculadoraPrecioHabitacion();

        ArrayList<Promocion> promociones = new ArrayList<>();
        promociones.add(new PromocionClientesVIP(0.15));
        promociones.add(new PromocionFecha("2025-09-10", 0.20));

        while (true) {
            System.out.println("\n--- MENU HOTEL ---");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Registrar Habitacion");
            System.out.println("3. Hacer Reserva");
            System.out.println("4. Cancelar Reserva");
            System.out.println("5. Consultar Cliente");
            System.out.println("6. Consultar Habitaciones");
            System.out.println("7. Asignar Personal");
            System.out.println("8. Generar Informe Personal");
            System.out.println("9. Salir");
            System.out.print("Opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1: // Registrar Cliente
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("DNI: ");
                    int dni = sc.nextInt();
                    System.out.print("VIP (true/false): ");
                    boolean vip = sc.nextBoolean();
                    Cliente cliente = new Cliente(nombre, dni, vip);
                    gestionClientes.registrarCliente(cliente);
                    System.out.println("Cliente registrado.");
                    break;

                case 2: // Registrar Habitacion
                    System.out.print("Tipo (Individual/Doble/Suite): ");
                    String tipo = sc.nextLine();
                    System.out.print("Cuarto: ");
                    String cuarto = sc.nextLine();
                    Habitacion hab;
                    if (tipo.equalsIgnoreCase("Individual")) hab = new Individual(cuarto);
                    else if (tipo.equalsIgnoreCase("Doble")) hab = new Doble(cuarto);
                    else hab = new Suite(cuarto);
                    gestionHabitaciones.registrarHabitacion(hab);
                    System.out.println("Habitación registrada.");
                    break;

                case 3: // Hacer Reserva
                    System.out.print("DNI Cliente: ");
                    int dniCliente = sc.nextInt();
                    sc.nextLine();
                    Cliente cliReserva = null;
                    for (Cliente c : gestionClientes.getClientes()) {
                        if (c.getDni() == dniCliente) cliReserva = c;
                    }
                    if (cliReserva == null) {
                        System.out.println("Cliente no encontrado.");
                        break;
                    }
                    System.out.print("Cuarto: ");
                    String cuartoReserva = sc.nextLine();
                    Habitacion habReserva = null;
                    for (Habitacion h : gestionHabitaciones.consultarHabitaciones()) {
                        if (h.getCuarto().equalsIgnoreCase(cuartoReserva)) habReserva = h;
                    }
                    if (habReserva == null) {
                        System.out.println("Habitación no encontrada.");
                        break;
                    }
                    System.out.print("Fecha (AAAA-MM-DD): ");
                    String fecha = sc.nextLine();
                    double precioFinal = calculadora.calcularPrecio(habReserva, cliReserva, fecha, promociones);
                    System.out.println("Precio final: " + precioFinal);
                    PoliticaCancelacion politica = new CancelacionFlexible();
                    Reserva reserva = new Reserva(habReserva, cliReserva, fecha, politica);
                    cliReserva.addReserva(reserva);
                    habReserva.addReserva(reserva);
                    System.out.println("Reserva realizada.");
                    break;

                case 4: // Cancelar Reserva
                    System.out.print("DNI Cliente: ");
                    int dniCancel = sc.nextInt();
                    Cliente cliCancel = null;
                    for (Cliente c : gestionClientes.getClientes()) {
                        if (c.getDni() == dniCancel) cliCancel = c;
                    }
                    if (cliCancel == null) {
                        System.out.println("Cliente no encontrado.");
                        break;
                    }
                    System.out.print("Fecha reserva a cancelar: ");
                    sc.nextLine();
                    String fechaCancel = sc.nextLine();
                    Reserva resCancelar = null;
                    for (Reserva r : cliCancel.getReservas()) {
                        if (r.getFecha().equals(fechaCancel) && r.isActiva()) resCancelar = r;
                    }
                    if (resCancelar != null) {
                        resCancelar.cancelar();
                        System.out.println("Reserva cancelada.");
                    } else System.out.println("Reserva no encontrada.");
                    break;

                case 5: // Consultar Cliente
                    System.out.print("DNI Cliente: ");
                    int dniConsulta = sc.nextInt();
                    Cliente cliConsulta = null;
                    for (Cliente c : gestionClientes.getClientes()) {
                        if (c.getDni() == dniConsulta) cliConsulta = c;
                    }
                    if (cliConsulta != null) {
                        System.out.println(gestionClientes.consultarCliente(cliConsulta));
                        System.out.println("Historial de reservas:");
                        for (Reserva r : cliConsulta.getReservas()) {
                            System.out.println("- " + r.getHabitacion().getTipo() + " " + r.getHabitacion().getCuarto() + " Fecha: " + r.getFecha() + " Activa: " + r.isActiva());
                        }
                    } else System.out.println("Cliente no encontrado.");
                    break;

                case 6: // Consultar Habitaciones
                    for (Habitacion h : gestionHabitaciones.consultarHabitaciones()) {
                        System.out.println(gestionHabitaciones.consultarHabitacion(h));
                    }
                    break;

                case 7: // Asignar Personal
                    System.out.print("Nombre Personal: ");
                    sc.nextLine();
                    String nombrePers = sc.nextLine();
                    PersonalLimpieza pers = new PersonalLimpieza(nombrePers);
                    gestionPersonal.addPersonal(pers);
                    System.out.print("Cuarto a asignar: ");
                    String cuartoPers = sc.nextLine();
                    Habitacion habPers = null;
                    for (Habitacion h : gestionHabitaciones.consultarHabitaciones()) {
                        if (h.getCuarto().equalsIgnoreCase(cuartoPers)) habPers = h;
                    }
                    if (habPers != null) gestionPersonal.asignarPersonal(pers, habPers);
                    System.out.println("Personal asignado.");
                    break;

                case 8: // Generar Informe Personal
                    ArrayList<String> informe = gestionPersonal.generarInformeTipoHabitacion();
                    for (String s : informe) System.out.println(s);
                    break;

                case 9: // Salir
                    System.out.println("Saliendo...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Opcion invalida.");
            }
        }
    }
}
