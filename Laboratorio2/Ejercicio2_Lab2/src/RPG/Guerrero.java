package RPG;

public class Guerrero extends Personaje implements IAtaqueFisico {

    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void usarHabilidad(int index, Personaje objetivo) {
        if (index >= 0 && index < habilidades.size()) {
            Habilidad h = habilidades.get(index);
            System.out.println(nombre + " usa la habilidad física " + h.getNombre() + " contra " + objetivo.getNombre());
            objetivo.recibirDanio(h.getPoder() + 10);
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
        System.out.println(nombre + " ataca con espada a " + objetivo.getNombre());
        objetivo.recibirDanio(15);
    }
}
