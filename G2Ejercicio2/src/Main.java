
public class Main {
    public static void main(String[] args) {

        // a. Inicializar el objeto Autor
        Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');

        // b. Imprimir al autor
        System.out.println(autor.mostrarInfo());

        // c. Inicializar el libro "Effective Java"
        Libro libro = new Libro("Effective Java", autor, 450, 150);

        // d. Imprimir el libro
        System.out.println(libro.mostrarInfo());

        // e. Modificar el precio y stock del libro
        libro.setPrecio(500);
        libro.aumentarStock(50);

        // f. Imprimir los atributos del autor desde el libro
        System.out.println("Autor del libro: " + libro.getAutor().mostrarInfo());

        // g. Imprimir el mensaje con los detalles del libro
        libro.imprimirDetalles();
    }
}