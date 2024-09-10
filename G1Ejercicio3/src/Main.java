
public class Main {
    public static void main(String[] args) {

        // Inciso a
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 500,10);

        // Inciso b
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 700, 5);

        // Inciso c
        System.out.println(libro1.mostrarInfo());
        System.out.println(libro2.mostrarInfo());

        // Inciso d
        String mensaje = libro1.venderCopias(3);
        System.out.println(mensaje);

        // Inciso e
        System.out.println(libro1.mostrarInfo());

        // Inciso f
        String mensaje2 = libro2.venderCopias(8);
        System.out.println(mensaje2);

        // Inciso g
        libro2.aumentarCopias(5);

        // Inciso h
        System.out.println(libro2.mostrarInfo());
    }
}