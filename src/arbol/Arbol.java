package arbol;

/**
 *
 * @author Estudiantes
 */
public abstract class Arbol {
    protected int grado;
    protected Nodo raiz;

    public Arbol(int grado) {
        this.grado = grado;
        this.raiz = null;
    }

    public int getGrado() {
        return grado;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void insertar(int dato) {
        if (raiz != null) {
            raiz.insertar(dato);
        }
    }

    public Nodo buscar(int dato) {
        if (raiz != null) {
            return raiz.buscar(dato);
        }
        return null;
    }

    public void eliminar(int dato) {
        if (raiz != null) {
            raiz.eliminar(dato);
        }
    }
}