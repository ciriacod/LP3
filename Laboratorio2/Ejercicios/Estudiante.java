package modelo;

public class Estudiante extends Persona {
    private String carrera;
    private int ingreso;

    public Estudiante(String nombre, String correo, String dni, String telefono, String carrera, int ingreso) {
        super(nombre, correo, dni, telefono);
        this.carrera = carrera;
        this.ingreso = ingreso;
    }

    public String getCarrera() { return carrera; }
    public int getIngreso() { return ingreso; }

    public void setCarrera(String carrera) { this.carrera = carrera; }
    public void setIngreso(int ingreso) { this.ingreso = ingreso; }

    @Override
    public void mostrarInformacion() {
        System.out.println("Estudiante: " + getNombre());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Carrera: " + carrera);
        System.out.println("Año de ingreso: " + ingreso);
    }
}
