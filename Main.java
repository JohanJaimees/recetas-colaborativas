import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorRecetas gestor = new GestorRecetas();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar receta");
            System.out.println("2. Mostrar recetas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    agregarReceta(gestor, scanner);
                    break;
                case 2:
                    mostrarRecetas(gestor);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    public static void agregarReceta(GestorRecetas gestor, Scanner scanner) {
        System.out.println("\nIngrese el nombre de la receta:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese los ingredientes (separados por coma):");
        String[] ingredientes = scanner.nextLine().split(",");

        System.out.println("Ingrese las instrucciones:");
        String instrucciones = scanner.nextLine();

        Receta nuevaReceta = new Receta(nombre, ingredientes, instrucciones);
        gestor.agregarReceta(nuevaReceta);

        System.out.println("✅ Receta agregada: " + nuevaReceta.getNombre());
    }

    public static void mostrarRecetas(GestorRecetas gestor) {
        System.out.println("\n📜 Recetas disponibles:");
        for (Receta receta : gestor.obtenerRecetas()) {
            System.out.println("- " + receta.getNombre());
        }
    }
}