package arbol;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

        arbol.insertar(150);
        arbol.insertar(30);
        arbol.insertar(200);
        arbol.insertar(1);
        arbol.insertar(100);
        arbol.insertar(175);
        arbol.insertar(400);
        arbol.insertar(130);
        arbol.insertar(150);

        System.out.println("Raiz actual: " + arbol.getRaiz().getDato());
        System.out.println("Altura arbol: " + arbol.getRaiz().getAltura());

        int[] valoresBusqueda = {150, 130, 400, 999};
        for (int v : valoresBusqueda) {
            Nodo n = arbol.buscar(v);
            if (n != null) {
                System.out.println("Dato " + v + " encontrado - Nivel: " + n.getNivel() + " Altura: " + n.getAltura());
            } else {
                System.out.println("Dato " + v + " no encontrado");
            }
        }

        System.out.println("Eliminando 150...");
        arbol.eliminar(150);
        System.out.println("Nueva raiz: " + arbol.getRaiz().getDato());

        System.out.println("Eliminando 30...");
        arbol.eliminar(30);
        
        Nodo nodo200 = arbol.buscar(200);
        if (nodo200 != null) {
            System.out.println("Nodo 200 - Nivel: " + nodo200.getNivel() + " Altura: " + nodo200.getAltura());
        }
    }
}