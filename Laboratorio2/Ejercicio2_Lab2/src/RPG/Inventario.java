package RPG;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private final List<Objeto> objetos = new ArrayList<>();

    public void agregarObjeto(Objeto obj) {
        objetos.add(obj);
    }

    public boolean removerPorNombre(String nombre) {
        return objetos.removeIf(o -> o.getNombre().equalsIgnoreCase(nombre));
    }

    public int getCantidad() { return objetos.size(); }

    public Objeto obtenerPrimeroPorTipo(String tipo) {
        for (Objeto o : objetos) {
            if (o.getTipo().equalsIgnoreCase(tipo)) return o;
        }
        return null;
    }

    public List<Objeto> getObjetos() { return new ArrayList<>(objetos); }

    @Override
    public String toString() {
        if (objetos.isEmpty()) return "(vacío)";
        StringBuilder sb = new StringBuilder();
        for (Objeto o : objetos) sb.append("- ").append(o).append("\n");
        return sb.toString();
    }
}
