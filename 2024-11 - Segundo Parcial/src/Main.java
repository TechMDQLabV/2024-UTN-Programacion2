import exceptions.StockInsuficienteException;
import models.Almacen;
import models.Laptop;
import models.Leche;
import models.Mesa;
import models.Pan;
import models.Producto;
import models.Sofa;
import models.Televisor;

public class Main {
    public static void main(String[] args) {
        // Crear un almacén
        Almacen<Producto> almacen = new Almacen<>();

        // Agregar productos al almacén
        almacen.agregarProducto(new Pan("Pan Blanco", 1.5));
        almacen.agregarProducto(new Leche("Leche Entera", 1.0));
        almacen.agregarProducto(new Televisor("Smart TV", 600.0));
        almacen.agregarProducto(new Laptop("Laptop Gaming", 1200.0));
        almacen.agregarProducto(new Sofa("Sofá de cuero", 450.0));
        almacen.agregarProducto(new Mesa("Mesa de comedor", 300.0));

        // Mostrar el valor total del inventario
        System.out.println("Valor total del inventario: " + almacen.calcularValorTotalInventario());

        // Simular la venta de un televisor
        try {
            almacen.venderProducto(new Televisor("Super Smart TV", 1600.0), 1);
            System.out.println("Televisor vendido.");
        } catch (StockInsuficienteException e) {
            e.printStackTrace();
        }
    }
}