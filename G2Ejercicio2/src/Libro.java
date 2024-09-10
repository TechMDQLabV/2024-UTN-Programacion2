public class Libro {

    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    //Constructor
    public Libro(String titulo, Autor autor, double precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }

    // Get y Set
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Metodos propios
    public void aumentarStock(int cantidad) {
        this.stock += cantidad;
    }

    public void imprimirDetalles() {
        System.out.println("El libro: " + titulo + " de " + autor.getNombre() + " se vende a " + precio + " pesos.");
    }

    public String mostrarInfo() {
        return "Título: " + titulo + ", Precio: " + precio + ", Stock: " + stock + ", Autor: " + autor.toString();
    }
}
