package RPG;

public class Mago extends Personaje implements IAtaqueMagico {

    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void usarHabilidad(int index, Personaje objetivo) {
        if (index >= 0 && index < habilidades.size()) {
            Habilidad h = habilidades.get(index);
            System.out.println(nombre + " lanza el hechizo " + h.getNombre() + " contra " + objetivo.getNombre());
            objetivo.recibirDanio(h.getPoder() + 20);
        } else {
            System.out.println(nombre + " no tiene esa habilidad.");
        }
    }

    @Override
    public void atacar(Personaje objetivo) {
        lanzarHechizo(objetivo);
    }

    @Override
    public void lanzarHechizo(Personaje objetivo) {
        System.out.println(nombre + " lanza un hechizo básico a " + objetivo.getNombre());
        objetivo.recibirDanio(12);
    }
}
