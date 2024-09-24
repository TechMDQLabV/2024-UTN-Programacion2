package models;

public abstract class AbstractHerramienta extends AbstractArticulo {
    private String modelo;

    public AbstractHerramienta() {
    }

    public AbstractHerramienta(String marca, float precio, int stock, String modelo) {
        super(marca, precio, stock);
        this.modelo = modelo;
    }

    // Getters y Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public AbstractHerramienta modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

}
