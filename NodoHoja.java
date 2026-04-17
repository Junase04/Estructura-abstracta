package arbol;

/**
 *
 * @author Estudiantes
 */
public class NodoHoja extends Nodo {

    public NodoHoja(int dato, int nivel, int altura) {
        super(dato, nivel, altura);
    }

    @Override
    public void insertar(int dato) {
        throw new UnsupportedOperationException("Un nodo hoja no puede tener hijos");
    }

    @Override
    public Nodo buscar(int dato) {
        if (this.dato == dato) {
            return this;
        }
        return null;
    }

    @Override
    public void eliminar(int dato) {
        if (this.dato == dato) {
            this.dato = 0; 
        }
    }
}