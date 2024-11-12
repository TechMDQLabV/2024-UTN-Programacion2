package models;

public class Sofa extends ProductoHogar {
    public Sofa(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return aplicarDescuento(precioBase);
    }
}
