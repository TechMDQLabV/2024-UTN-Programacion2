import java.util.Scanner;

public class GestionEmpleados {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Empleado empleado1 = null, empleado2 = null, empleado3 = null;

        boolean salir = false;

        while (!salir) {

            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar Empleado Tiempo Completo");
            System.out.println("2. Agregar Empleado por Horas");
            System.out.println("3. Agregar Empleado Contratista");
            System.out.println("4. Mostrar pagos de empleados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreCompleto = scanner.next();

                    System.out.print("Ingrese el salario mensual: ");
                    double salarioMensual = scanner.nextDouble();

                    empleado1 = new EmpleadoTiempoCompleto(salarioMensual, nombreCompleto);

                    System.out.println("Empleado a tiempo completo agregado.");
                    break;

                case 2:

                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombrePorHora = scanner.next();

                    System.out.print("Ingrese el precio por hora: ");
                    double precioPorHora = scanner.nextDouble();

                    System.out.print("Ingrese las horas trabajadas: ");
                    int horasTrabajadas = scanner.nextInt();

                    empleado2 = new EmpleadoPorHora(nombrePorHora, precioPorHora, horasTrabajadas);

                    System.out.println("Empleado por horas agregado.");

                    break;

                case 3:

                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreContratista = scanner.next();

                    System.out.print("Ingrese la tarifa por proyecto: ");
                    double tarifaPorProyecto = scanner.nextDouble();

                    System.out.print("Ingrese las horas trabajadas: ");
                    int horasProyecto = scanner.nextInt();

                    empleado3 = new EmpleadoContratista(nombreContratista, tarifaPorProyecto, horasProyecto);

                    System.out.println("Empleado contratista agregado.");

                    break;

                case 4:
                    System.out.println("\n--- Pagos de Empleados ---");

                    if (empleado1 != null) {
                        System.out.println(empleado1.getNombre() + " - Pago: $" + empleado1.calcularPago());
                    }

                    if (empleado2 != null) {
                        System.out.println(empleado2.getNombre() + " - Pago: $" + empleado2.calcularPago());
                    }

                    if (empleado3 != null) {
                        System.out.println(empleado3.getNombre() + " - Pago: $" + empleado3.calcularPago());
                    }

                    break;

                case 5:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}
