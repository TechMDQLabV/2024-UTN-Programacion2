import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ItemVenta item = null;
        boolean salir = false;

        while (!salir) {
            System.out.println("\nElige una opción:");
            System.out.println("1. Agregar ítem");
            System.out.println("2. Imprimir ítem");
            System.out.println("3. Actualizar cantidad");
            System.out.println("4. Actualizar precio unitario");
            System.out.println("5. Imprimir precio total");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el identificador:");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Limpiar buffer
                    System.out.println("Ingresa la descripción:");
                    String descripcion = scanner.nextLine();
                    System.out.println("Ingresa la cantidad:");
                    int cantidad = scanner.nextInt();
                    System.out.println("Ingresa el precio unitario:");
                    double precioUnitario = scanner.nextDouble();

                    item = new ItemVenta(id, descripcion, cantidad, precioUnitario);
                    System.out.println("Ítem agregado exitosamente.");
                    break;

                case 2:
                    if (item != null) {
                        System.out.println(item.mostrarInfo());
                    } else {
                        System.out.println("No hay ítem registrado.");
                    }
                    break;

                case 3:
                    if (item != null) {
                        System.out.println("Ingresa la nueva cantidad:");
                        int nuevaCantidad = scanner.nextInt();
                        item.setCantidad(nuevaCantidad);
                        System.out.println("Cantidad actualizada exitosamente.");
                    } else {
                        System.out.println("No hay ítem registrado.");
                    }
                    break;

                case 4:
                    if (item != null) {
                        System.out.println("Ingresa el nuevo precio unitario:");
                        double nuevoPrecioUnitario = scanner.nextDouble();
                        item.setPrecioUnitario(nuevoPrecioUnitario);
                        System.out.println("Precio unitario actualizado exitosamente.");
                    } else {
                        System.out.println("No hay ítem registrado.");
                    }
                    break;

                case 5:
                    if (item != null) {
                        System.out.println("El precio total es: " + item.calcularPrecioTotal());
                    } else {
                        System.out.println("No hay ítem registrado.");
                    }
                    break;

                case 6:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
    
}