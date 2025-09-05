package SIHotel;

import java.util.ArrayList;

public class GestionPersonal implements AddPersonal, ConsultarPersonal, GenerarInformes {
    private ArrayList<Personal> personalHotel = new ArrayList<>();

    @Override
    public ArrayList<String> generarInformeTipoHabitacion() {
        ArrayList<String> informe = new ArrayList<>();
        for (Personal p : personalHotel) {
            informe.add("Personal: " + p.getNombre() + 
                        "Habitaciones asignadas: " + p.getCarga());
        }
        return informe;
    }

    @Override
    public ArrayList<String> generarInformePeriodoTiempo() {
        ArrayList<String> informe = new ArrayList<>();
        informe.add("Funcionalidad pendiente: informe por periodo de tiempo");
        return informe;
    }

    @Override
    public int consultarCarga(Personal personalSeleccionado) {
        return personalSeleccionado.getCarga();
    }

    @Override
    public void addPersonal(Personal personalAdicional) {
        personalHotel.add(personalAdicional);
    }

    @Override
    public void asignarPersonal(Personal personalSeleccionado, Habitacion habitacionAsignada) {
        personalSeleccionado.getHabitacionesAsignadas().add(habitacionAsignada);
        personalSeleccionado.incrementarCarga();
    }

    public ArrayList<Personal> getPersonalHotel() {
        return personalHotel;
    }
}
