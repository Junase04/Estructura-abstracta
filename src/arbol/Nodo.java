
package arbol;

/**
 *
 * @author Estudiantes
 */
public abstract class Nodo {
    protected int nivel;
    protected int altura;
    public int dato;

    public Nodo(int dato, int nivel, int altura) {
        this.dato = dato;
        this.nivel = nivel;
        this.altura = altura;
    }

    public int getDato() {
        return dato;
    }

    public int getNivel() {
        return nivel;
    }

    public int getAltura() {
        return altura;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public abstract void insertar(int dato);
    public abstract Nodo buscar(int dato);
    public abstract void eliminar(int dato);
}