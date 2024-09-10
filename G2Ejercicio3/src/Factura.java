import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Factura {
    private String id;
    private double monto;
    private LocalDateTime fecha;
    private Cliente cliente;

    public Factura(double monto, Cliente cliente) {
        this.id = UUID.randomUUID().toString();  // Generación automática del ID
        this.monto = monto;
        this.fecha = LocalDateTime.now();  // Fecha y hora actual
        this.cliente = cliente;
    }

    // Get y Set
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    // Método para calcular el monto con descuento
    public double calcularMontoConDescuento() {
        return monto - (monto * cliente.getDescuento() / 100);
    }

    // Método para impresión de detalles de la factura
    public String imprimirDetalles() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return "Factura[id=" + id + ", fecha=" + fecha.format(formatter) + ", monto=" + monto +
                ", montoDesc=" + calcularMontoConDescuento() + ", " + cliente.imprimirDetalles() + "]";
    }


}