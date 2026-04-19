package arbol;
public class ArbolBinarioBusqueda extends Arbol {

    public ArbolBinarioBusqueda() {
        super(2);
    }

    private class NodoBinario extends Nodo {
        NodoBinario izquierdo;
        NodoBinario derecho;

        public NodoBinario(int dato, int nivel) {
            super(dato, nivel, 0);
        }

        @Override
        public void insertar(int nuevoDato) {
            if (nuevoDato <= this.dato) {
                if (this.izquierdo == null) {
                    this.izquierdo = new NodoBinario(nuevoDato, this.nivel + 1);
                } else {
                    this.izquierdo.insertar(nuevoDato);
                }
            } else {
                if (this.derecho == null) {
                    this.derecho = new NodoBinario(nuevoDato, this.nivel + 1);
                } else {
                    this.derecho.insertar(nuevoDato);
                }
            }
            actualizarMetricas();
        }

        private void actualizarMetricas() {
            int altIzq = (izquierdo != null) ? izquierdo.getAltura() : -1;
            int altDer = (derecho != null) ? derecho.getAltura() : -1;
            this.altura = 1 + Math.max(altIzq, altDer);
        }

        @Override
        public Nodo buscar(int datoBuscar) {
            if (this.dato == datoBuscar) return this;
            if (datoBuscar <= this.dato && izquierdo != null) return izquierdo.buscar(datoBuscar);
            if (datoBuscar > this.dato && derecho != null) return derecho.buscar(datoBuscar);
            return null;
        }

        @Override
        public void eliminar(int dato) {}
    }

    @Override
    public void insertar(int dato) {
        if (raiz == null) {
            raiz = new NodoBinario(dato, 0);
        } else {
            raiz.insertar(dato);
        }
    }

    @Override
    public void eliminar(int dato) {
        raiz = eliminarRecursivo((NodoBinario) raiz, dato);
    }

    private NodoBinario eliminarRecursivo(NodoBinario actual, int dato) {
        if (actual == null) return null;

        if (dato < actual.getDato()) {
            actual.izquierdo = eliminarRecursivo(actual.izquierdo, dato);
        } else if (dato > actual.getDato()) {
            actual.derecho = eliminarRecursivo(actual.derecho, dato);
        } else {
            
            if (actual.izquierdo == null) return actual.derecho;
            if (actual.derecho == null) return actual.izquierdo;

            // Lógica de tu imagen: "La hoja más a la derecha de la rama izquierda" (Predecesor)
            int maximoIzquierda = encontrarMaximo(actual.izquierdo);
            actual.dato = maximoIzquierda;
            actual.izquierdo = eliminarRecursivo(actual.izquierdo, maximoIzquierda);
        }
        
        if (actual != null) {
            actual.setAltura(1 + Math.max(
                (actual.izquierdo != null ? actual.izquierdo.getAltura() : -1),
                (actual.derecho != null ? actual.derecho.getAltura() : -1)
            ));
        }
        return actual;
    }

    private int encontrarMaximo(NodoBinario nodo) {
        int max = nodo.getDato();
        while (nodo.derecho != null) {
            nodo = nodo.derecho;
            max = nodo.getDato();
        }
        return max;
    }
}