import exceptions.ProductoInexistenteException;
import models.AbstractArticulo;
import models.Articulos;
import models.HerramientaElectrica;
import models.HerramientaManual;
import models.Tornillo;

public class Main {
    public static void main(String[] args)  {
        long startTime = System.currentTimeMillis();
        Articulos articulos = new Articulos(100);
        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo de ejecucion: " + (endTime - startTime) + " ms");
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

        System.out.println("<<<<<<<<<<<<<<<<<< ShowFilter >>>>>>>>>>>>>>>>>>");
        articulos.showFilter(Tornillo.class.getSimpleName());
        articulos.showFilter(Tornillo.class);
        articulos.showFilter2(HerramientaManual.class);
        articulos.showClass(HerramientaElectrica.class);
        StringBuilder sb = new StringBuilder();
        sb.append("Hola").append(" ").append("Mundo");
        StringBuffer stringBuffer = new StringBuffer();


        try {
            articulos.removeArticulo(5000);
        } catch (ProductoInexistenteException e) {
            //e.printStackTrace();
           System.out.println(e.getMessage());
        }
    }

    public static void showArticulo(AbstractArticulo articulo) {
        articulo.show();
    }
}