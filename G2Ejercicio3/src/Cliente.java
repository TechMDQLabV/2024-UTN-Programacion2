import java.util.UUID;

public class Cliente {
    private String id;
    private String nombre;
    private String email;
    private double descuento;

    //Constructor
    public Cliente(String nombre, String email, double descuento) {
        this.id = UUID.randomUUID().toString();  // Generación automática del ID
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

   //Get y Set
    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos propios
    public String imprimirDetalles() {
        return "Cliente[id=" + id + ", nombre=" + nombre + ", email=" + email + ", descuento=" + descuento + "]";
    }
}