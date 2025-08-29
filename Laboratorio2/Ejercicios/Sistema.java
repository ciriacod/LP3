package modelo;

public class Sistema implements GeneradorReportes {

    private Estudiante[] estudiantes;
    private Curso[] cursos;
    private Profesor[] profesores;

    private int totalEstudiantes = 0;
    private int totalCursos = 0;
    private int totalProfesores = 0;

    public Sistema() {
        estudiantes = new Estudiante[100];
        cursos = new Curso[100];
        profesores = new Profesor[100];
    }

    public void registrarEstudiante(Estudiante e) {
        if (totalEstudiantes < estudiantes.length) {
            estudiantes[totalEstudiantes++] = e;
        } else {
            System.out.println(" No se pueden registrar más estudiantes.");
        }
    }

    public void registrarCurso(Curso c) {
        if (totalCursos < cursos.length) {
            cursos[totalCursos++] = c;
        } else {
            System.out.println(" No se pueden registrar más cursos.");
        }
    }

    public void registrarProfesor(Profesor p) {
        if (totalProfesores < profesores.length) {
            profesores[totalProfesores++] = p;
        } else {
            System.out.println(" No se pueden registrar más profesores.");
        }
    }

    @Override
    public void reporteEstudiante() {
        System.out.println("=== REPORTE DE ESTUDIANTES ===");
        for (int i = 0; i < totalEstudiantes; i++) {
            estudiantes[i].mostrarInformacion();
        }
    }

    @Override
    public void reporteCurso() {
        System.out.println("=== REPORTE DE CURSOS ===");
        for (int i = 0; i < totalCursos; i++) {
            cursos[i].mostrarCurso();
        }
    }

    @Override
    public void reporteProfesor() {
        System.out.println("=== REPORTE DE PROFESORES ===");
        for (int i = 0; i < totalProfesores; i++) {
            profesores[i].mostrarInformacion();
        }
    }
}


