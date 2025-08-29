package RPG;

public class Arquero extends Personaje implements IAtaqueFisico {

    public Arquero(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void usarHabilidad(int index, Personaje objetivo) {
        if (index >= 0 && index < habilidades.size()) {
            Habilidad h = habilidades.get(index);
            System.out.println(nombre + " dispara una flecha especial: " + h.getNombre() + " contra " + objetivo.getNombre());
            objetivo.recibirDanio(h.getPoder() + 5);
        } else {
            System.out.println(nombre + " no tiene esa habilidad.");
        }
    }

    @Override
    public void atacar(Personaje objetivo) {
        atacarCuerpoACuerpo(objetivo);
    }

    @Override
    public void atacarCuerpoACuerpo(Personaje objetivo) {
        System.out.println(nombre + " dispara una flecha a " + objetivo.getNombre());
        objetivo.recibirDanio(10);
    }
}
