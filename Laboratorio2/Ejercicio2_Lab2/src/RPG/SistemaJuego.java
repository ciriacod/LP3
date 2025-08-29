package RPG;

public class SistemaJuego {
    public static void main(String[] args) {
        Personaje p1 = new Guerrero("Arthur", 3);
        Personaje p2 = new Mago("Morgana", 5);
        Personaje p3 = new Arquero("Robin", 4);

        Habilidad espadazo = new Habilidad("Espadazo", 20);
        Habilidad bolaDeFuego = new Habilidad("Bola de Fuego", 30);
        Habilidad flechaHelada = new Habilidad("Flecha Helada", 15);

        p1.aprenderHabilidad(espadazo);
        p2.aprenderHabilidad(bolaDeFuego);
        p3.aprenderHabilidad(flechaHelada);

        p1.atacar(p2);
        p2.atacar(p1);
        p3.atacar(p2);

        p1.usarHabilidad(0, p2);
        p2.usarHabilidad("Bola de Fuego", p1);
        p3.usarHabilidad(p1);
    }
}
