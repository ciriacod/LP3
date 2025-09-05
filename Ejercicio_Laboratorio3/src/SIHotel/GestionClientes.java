package SIHotel;

import java.util.ArrayList;

public class GestionClientes implements RegistrarClientes, ConsultarClientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    @Override
    public String consultarCliente(Cliente clienteConsultado) {
        return "Nombre: " + clienteConsultado.getNombre() + " Dni: " + clienteConsultado.getDni();
    }

    @Override
    public ArrayList<Reserva> consultarHistorial(Cliente clienteConsultado) {
        return clienteConsultado.getReservas();
    }

    @Override
    public void registrarCliente(Cliente clienteNuevo) {
        clientes.add(clienteNuevo);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
