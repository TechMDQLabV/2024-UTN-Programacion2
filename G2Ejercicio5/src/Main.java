
public class Main {
    public static void main(String[] args) {

        // Inicializar 4 estudiantes
        Estudiante estudiante1 = new Estudiante("1111", "Juan", "Pérez", "juan@email.com", "Calle 1", 2020, 3000, "Ingeniería");
        Estudiante estudiante2 = new Estudiante("2222", "Ana", "López", "ana@email.com", "Calle 2", 2019, 3200, "Medicina");
        Estudiante estudiante3 = new Estudiante("3333", "Luis", "García", "luis@email.com", "Calle 3", 2021, 3100, "Derecho");
        Estudiante estudiante4 = new Estudiante("4444", "Maria", "Rodríguez", "maria@email.com", "Calle 4", 2018, 2900, "Arquitectura");

        // Inicializar 4 miembros de staff
        MiembroStaff staff1 = new MiembroStaff("5555", "Pedro", "Gómez", "pedro@email.com", "Calle 5", 50000, "Mañana");
        MiembroStaff staff2 = new MiembroStaff("6666", "Lucía", "Martínez", "lucia@email.com", "Calle 6", 48000, "Noche");
        MiembroStaff staff3 = new MiembroStaff("7777", "Carlos", "Fernández", "carlos@email.com", "Calle 7", 51000, "Mañana");
        MiembroStaff staff4 = new MiembroStaff("8888", "Sofía", "Suárez", "sofia@email.com", "Calle 8", 47000, "Noche");

        // Crear un array para almacenar los objetos
        Persona[] personas = { estudiante1, estudiante2, estudiante3, estudiante4, staff1, staff2, staff3, staff4 };

        // Contar estudiantes y staff usando instanceof
        int cantidadEstudiantes = 0;
        int cantidadStaff = 0;

        for (Persona persona : personas) {
            if (persona instanceof Estudiante) {
                cantidadEstudiantes++;
            } else if (persona instanceof MiembroStaff) {
                cantidadStaff++;
            }
        }

        System.out.println("Cantidad de estudiantes: " + cantidadEstudiantes);
        System.out.println("Cantidad de miembros de staff: " + cantidadStaff);

        // Sumar el total de ingresos por cuotas de estudiantes
        double totalIngresos = 0;
        for (Persona persona : personas) {
            if (persona instanceof Estudiante) {
                totalIngresos += ((Estudiante) persona).getCuotaMensual();
            }
        }

        System.out.println("Total ingresos por cuotas de estudiantes: " + totalIngresos);
    }
}