package arbol;
public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

        // 1. Prueba de Inserción (Incluyendo duplicado para probar tu regla)
        System.out.println("--- 1. Probando Inserción (Regla: Iguales a la izquierda) ---");
        arbol.insertar(150);
        arbol.insertar(30);
        arbol.insertar(200);
        arbol.insertar(150); // Este debe quedar a la izquierda del primer 150
        System.out.println("Inserción completada.");

        // 2. Verificación de Propiedades
        System.out.println("\n--- 2. Propiedades del Árbol ---");
        if (arbol.getRaiz() != null) {
            System.out.println("Raíz: " + arbol.getRaiz().getDato());
            System.out.println("Altura total: " + arbol.getRaiz().getAltura());
        }

        // 3. Prueba de Búsqueda
        System.out.println("\n--- 3. Probando Búsqueda ---");
        int valor = 200;
        Nodo encontrado = arbol.buscar(valor);
        if (encontrado != null) {
            System.out.println("Encontrado: " + valor + " en nivel " + encontrado.getNivel());
        }

        // 4. Prueba de Eliminación (Lógica de tus imágenes: Predecesor)
        System.out.println("\n--- 4. Probando Eliminación (Reemplazo por Izquierda) ---");
        // Según tu imagen, si borramos 150, debería subir el más grande de su izquierda.
        System.out.println("Eliminando raíz (150)...");
        arbol.eliminar(150);

        if (arbol.getRaiz() != null) {
            System.out.println("Nueva raíz después de eliminar: " + arbol.getRaiz().getDato());
            // Si el duplicado 150 subió, la lógica es correcta. 
            // Si no había duplicados, subiría el 30 en este ejemplo pequeño.
        }
    }
}
