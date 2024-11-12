package models;

public class Leche extends ProductoAlimentacion {
    public Leche(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return aplicarDescuento(precioBase);
    }
}

