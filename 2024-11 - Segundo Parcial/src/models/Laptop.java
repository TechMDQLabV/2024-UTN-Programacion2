package models;

public class Laptop extends ProductoElectronica {
    public Laptop(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return aplicarDescuento(precioBase);
    }
}

