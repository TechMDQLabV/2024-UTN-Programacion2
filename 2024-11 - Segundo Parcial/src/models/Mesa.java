package models;

public class Mesa extends ProductoHogar {
    public Mesa(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return aplicarDescuento(precioBase);
    }
}

