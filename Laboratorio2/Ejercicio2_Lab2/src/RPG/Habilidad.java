package RPG;

public class Habilidad {
    private String nombre;
    private int poder;

    public Habilidad(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = Math.max(0, poder);
    }

    public String getNombre() { return nombre; }
    public int getPoder() { return poder; }

    @Override
    public String toString() {
        return nombre + " (poder: " + poder + ")";
    }
}
