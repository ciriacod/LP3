package SIHotel;

import java.util.ArrayList;

public abstract class Personal {
    private String nombre;
    private int carga;
    private final ArrayList<Habitacion> habitacionesAsignadas = new ArrayList<>();
    
    protected Personal(String nombre){
        this.nombre = nombre;
        this.carga = 0;
    }
    
    public ArrayList<Habitacion> getHabitacionesAsignadas(){
        return habitacionesAsignadas;
    }

    public int getCarga() {
        return carga;
    }

    public String getNombre() {
        return nombre;
    }

    public void incrementarCarga() {
        this.carga++;
    }

    public void reducirCarga() {
        if (this.carga > 0) {
            this.carga--;
        }
    }
}
