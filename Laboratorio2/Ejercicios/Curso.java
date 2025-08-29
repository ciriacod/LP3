package modelo;
public class Curso {
    private String codigo;
    private String nombre;
    private int creditos;
    private String modalidad;
    private Profesor profesorAsignado;

    // Constructor
    public Curso(String codigo, String nombre, int creditos, String modalidad, Profesor profesorAsignado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.modalidad = modalidad;
        this.profesorAsignado = profesorAsignado;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getCreditos() { return creditos; }
    public String getModalidad() { return modalidad; }
    public Profesor getProfesorAsignado() { return profesorAsignado; }

    // Método para mostrar información del curso
    public void mostrarCurso() {
        System.out.println("curso: " + nombre);
        System.out.println("codigo: " + codigo);
        System.out.println("creditos: " + creditos);
        System.out.println("modalidad: " + modalidad);
        if (profesorAsignado != null) {
            System.out.println("Profesor asignado: " + profesorAsignado.getNombre());
        }

         else {
            System.out.println("Profesor asignado: Sin asignar");
        }
    }
}
