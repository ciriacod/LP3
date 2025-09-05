package SIHotel;

import java.util.ArrayList;

public class Cliente implements IManejoReservas {
    private String nombre;
    private int dni;
    private boolean esVIP;
    private ArrayList<Reserva> historialReservas = new ArrayList<>();

    public Cliente(String nombre, int dni, boolean esVIP) {
        this.nombre = nombre;
        this.dni = dni;
        this.esVIP = esVIP;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public boolean isVIP() {
        return esVIP;
    }

    public void setVIP(boolean esVIP) {
        this.esVIP = esVIP;
    }

    @Override
    public void addReserva(Reserva reserva) {
        historialReservas.add(reserva);
    }

    public ArrayList<Reserva> getReservas() {
        return historialReservas;
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.cancelar();
    }
}