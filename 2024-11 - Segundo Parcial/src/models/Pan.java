package models;

public class Pan extends ProductoAlimentacion {
    public Pan(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return aplicarDescuento(precioBase);
    }
}
