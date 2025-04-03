import java.util.ArrayList;
import java.util.List;

public class GestorRecetas {
    private List<Receta> recetas = new ArrayList<>();
    
    public void agregarReceta(Receta receta) {
        recetas.add(receta);
    }
    
    public List<Receta> obtenerRecetas() {
        return recetas;
    }

    public void eliminarReceta(String nombre) {
    recetas.removeIf(receta -> receta.getNombre().equalsIgnoreCase(nombre));
    }

    public Receta buscarReceta(String nombre) {
        for (Receta receta : recetas) {
            if (receta.getNombre().equalsIgnoreCase(nombre)) {
                return receta;
            }
        }
        return null; // Si no se encuentra la receta
    }
    
}