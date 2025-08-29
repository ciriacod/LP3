package modelo;

public class Profesor extends Persona {
    private String especialidad;
    private String codigoProfesor;

    public Profesor(String nombre, String correo, String dni, String telefono, String especialidad, String codigoProfesor) {
        super(nombre, correo, dni, telefono);
        this.especialidad = especialidad;
        this.codigoProfesor = codigoProfesor;
    }

    public String getEspecialidad() { return especialidad; }
    public String getCodigoProfesor() { return codigoProfesor; }

    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public void setCodigoProfesor(String codigoProfesor) { this.codigoProfesor = codigoProfesor; }

    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Codigo: " + codigoProfesor);
    }
}
