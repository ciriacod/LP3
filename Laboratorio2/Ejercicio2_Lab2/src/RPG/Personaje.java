package RPG;

import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {
    public static final int NIVEL_MAXIMO = 100;
    private final int SALUD_MAXIMA = 100;

    protected String nombre;
    protected int salud;
    protected int nivel;
    protected Inventario inventario;
    protected List<Habilidad> habilidades;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = Math.max(1, Math.min(nivel, NIVEL_MAXIMO));
        this.salud = SALUD_MAXIMA;
        this.inventario = new Inventario();
        this.habilidades = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public int getSalud() { return salud; }
    public int getNivel() { return nivel; }
    public Inventario getInventario() { return inventario; }

    public void setSalud(int salud) {
        if (salud < 0) this.salud = 0;
        else if (salud > SALUD_MAXIMA) this.salud = SALUD_MAXIMA;
        else this.salud = salud;
    }

    public void aprenderHabilidad(Habilidad h) {
        habilidades.add(h);
        System.out.println(nombre + " aprendió la habilidad: " + h.getNombre());
    }

    protected void recibirDanio(int puntos) {
        salud -= puntos;
        if (salud < 0) salud = 0;
    }

    public abstract void usarHabilidad(int index, Personaje objetivo);

    public void usarHabilidad(String nombreHab, Personaje objetivo) {
        for (Habilidad h : habilidades) {
            if (h.getNombre().equalsIgnoreCase(nombreHab)) {
                System.out.println(nombre + " usa " + h.getNombre() + " contra " + objetivo.getNombre());
                objetivo.recibirDanio(h.getPoder());
                return;
            }
        }
        System.out.println(nombre + " no conoce esa habilidad.");
    }

    public void usarHabilidad(Personaje objetivo) {
        if (!habilidades.isEmpty()) {
            Habilidad h = habilidades.get(0);
            System.out.println(nombre + " usa por defecto " + h.getNombre() + " contra " + objetivo.getNombre());
            objetivo.recibirDanio(h.getPoder());
        } else {
            System.out.println(nombre + " no tiene habilidades aún.");
        }
    }

    public abstract void atacar(Personaje objetivo);
}
