package SIHotel;

import java.util.ArrayList;

public interface ConsultarClientes {
    String consultarCliente(Cliente clienteConsultado);
    ArrayList<Reserva> consultarHistorial(Cliente clienteConsultado);
}
