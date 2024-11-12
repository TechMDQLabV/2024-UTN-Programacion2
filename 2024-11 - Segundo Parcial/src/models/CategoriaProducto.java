package models;

public enum CategoriaProducto {
    ALIMENTACION(0.05),  // 5% de descuento
    ELECTRONICA(0.10),   // 10% de descuento
    HOGAR(0.07);         // 7% de descuento

    private double porcentajeDescuento;

    CategoriaProducto(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
}

