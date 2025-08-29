package RPG;

public class Objeto {
    private String nombre;
    private String tipo;
    private int curacion;

    public Objeto(String nombre, String tipo, int curacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.curacion = Math.max(0, curacion);
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public int getCuracion() { return curacion; }

    @Override
    public String toString() {
        return nombre + " [" + tipo + "]" + (curacion > 0 ? " (+ " + curacion + " HP)" : "");
    }
}
