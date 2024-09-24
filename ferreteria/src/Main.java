import models.AbstractArticulo;
import models.Articulos;

public class Main {
    public static void main(String[] args) {
        Articulos articulos = new Articulos(100);

        articulos.sort();
        articulos.show();
        articulos.showClavos();
        articulos.showTornillos();
        articulos.showHerramientasElectricas();
        articulos.showHerramientasManuales();

        AbstractArticulo addStock = articulos.getArticulo(10);

        System.out.println("Stock antes de agregar: " + addStock.getStock());
        showArticulo(addStock);
        boolean resultAddStock = articulos.addStock(10, 10);
        System.out.println("Stock despues de agregar: " + addStock.getStock() + " Resultado de la adicion: " + resultAddStock);
        showArticulo(addStock);

        AbstractArticulo venta = articulos.getArticulo(20);
        System.out.println("Stock antes de vender: " + venta.getStock());
        showArticulo(venta);
        boolean resultVenta = articulos.venta(20, 5);
        System.out.println("Stock despues de vender: " + venta.getStock() + " Resultado de la venta: " + resultVenta);
        showArticulo(venta);


    }

    public static void showArticulo(AbstractArticulo articulo){
        articulo.show();
    }
}