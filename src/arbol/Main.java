package arbol;
public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

        
        System.out.println("--- 1. Probando Inserción (Regla: Iguales a la izquierda) ---");
        arbol.insertar(150);
        arbol.insertar(30);
        arbol.insertar(200);
        arbol.insertar(150); 
        System.out.println("Inserción completada.");

        
        System.out.println("\n--- 2. Propiedades del Árbol ---");
        if (arbol.getRaiz() != null) {
            System.out.println("Raíz: " + arbol.getRaiz().getDato());
            System.out.println("Altura total: " + arbol.getRaiz().getAltura());
        }

        
        System.out.println("\n--- 3. Probando Búsqueda ---");
        int valor = 200;
        Nodo encontrado = arbol.buscar(valor);
        if (encontrado != null) {
            System.out.println("Encontrado: " + valor + " en nivel " + encontrado.getNivel());
        }

        
        System.out.println("\n--- 4. Probando Eliminación (Reemplazo por Izquierda) ---");
        
        System.out.println("Eliminando raíz (150)...");
        arbol.eliminar(150);

        if (arbol.getRaiz() != null) {
            System.out.println("Nueva raíz después de eliminar: " + arbol.getRaiz().getDato());
            
    }
}
}
