public class ItemVenta {
    private int identificador;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    // Constructor
    public ItemVenta(int identificador, String descripcion, int cantidad, double precioUnitario) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Getters y Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    // Método para calcular el precio total
    public double calcularPrecioTotal() {
        return precioUnitario * cantidad;
    }

    // Método para representar el objeto en forma de cadena
    public String mostrarInfo() {
        return "ItemVenta[id=" + identificador +
                ", descripcion=" + descripcion +
                ", cantidad=" + cantidad +
                ", pUnitario=" + precioUnitario +
                ", pTotal=" + calcularPrecioTotal() + "]";
    }
}
