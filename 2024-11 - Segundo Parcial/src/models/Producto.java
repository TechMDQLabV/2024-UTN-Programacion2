package models;

public abstract class Producto {
    protected String nombre;
    protected double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    // Método abstracto para calcular el precio final con descuentos.
    public abstract double calcularPrecioFinal();
}

