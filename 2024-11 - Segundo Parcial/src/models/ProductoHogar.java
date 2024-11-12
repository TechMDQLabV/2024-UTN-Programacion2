package models;

public abstract class ProductoHogar extends Producto implements IDescuento {
    protected CategoriaProducto categoria = CategoriaProducto.HOGAR;

    public ProductoHogar(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio * (1 - categoria.getPorcentajeDescuento());
    }

    @Override
    public double calcularPrecioFinal() {
        return aplicarDescuento(precioBase);
    }
}

