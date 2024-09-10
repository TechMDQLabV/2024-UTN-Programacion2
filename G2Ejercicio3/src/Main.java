import java.util.UUID;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //a y b son de investigación

        // c. Crear un objeto de tipo Cliente e imprimir sus detalles
        Cliente cliente = new Cliente("Juan Perez", "juanperez@email.com", 10.0);
        System.out.println(cliente.imprimirDetalles());

        // d. Crear un objeto de tipo Factura y calcular montos
        Factura factura = new Factura(1000, cliente);

        // Imprimir el monto total de la factura y el monto con descuento
        System.out.println("Monto total sin descuento: " + factura.getMonto());
        System.out.println("Monto total con descuento: " + factura.calcularMontoConDescuento());

        // e. Imprimir los detalles de la factura usando el método personalizado
        System.out.println(factura.imprimirDetalles());
    }
}