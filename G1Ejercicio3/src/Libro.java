public class Libro {
    private static int contadorId = 0;  // Variable estática para autoincrementar el ID
    private int id;
    private String titulo;
    private String autor;
    private double precio;
    private int cantidadDeCopiasDisponibles;

    // Constructor
    public Libro(String titulo, String autor, double precio, int cantidadDeCopiasDisponibles) {
        this.id = ++contadorId;  // Autoincrementa el ID
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidadDeCopiasDisponibles = cantidadDeCopiasDisponibles;
    }

    // Get y Set
    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Libro.contadorId = contadorId;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDeCopiasDisponibles() {
        return cantidadDeCopiasDisponibles;
    }

    public void setCantidadDeCopiasDisponibles(int cantidadDeCopiasDisponibles) {
        this.cantidadDeCopiasDisponibles = cantidadDeCopiasDisponibles;
    }

    // Método que permite vender copias
    public String venderCopias(int cant){
        String mensaje;

        if(cant > 0){
            int cantRestantes = cantidadDeCopiasDisponibles - cant;

            if(cantRestantes >= 0){
                cantidadDeCopiasDisponibles -= cant;
                mensaje = "Venta realizada con exito!";
            }else{
                mensaje = "No hay copias suficientes para realizar dicha venta. ";
            }

        }else{
            mensaje = "No se puede vender una cantidad negativa de copias";
        }

        return mensaje;
    }

    // Método que permite aumentar la cantidad de copias disponibles
    public String aumentarCopias(int cantDeCopias){
        String mensaje;

        if(cantDeCopias >= 0){
            cantidadDeCopiasDisponibles += cantDeCopias;
            mensaje = "Cantidad de copias incrementadas con exito. ";
        }else{
            mensaje = "No es posible incrementar la cant de copias en un valor negativo";
        }

        return mensaje;
    }

    // Método que facilita mostrar la información
    public String mostrarInfo() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", cantidadDeCopiasDisponibles=" + cantidadDeCopiasDisponibles +
                '}';
    }

}
