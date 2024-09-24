package models;

import java.util.Objects;
import java.util.UUID;

public abstract class AbstractArticulo implements Comparable<AbstractArticulo> {
    private static int staticId = 0;
    protected int idInt = staticId;
    protected String id = UUID.randomUUID().toString();
    protected String marca;
    protected float precio;
    protected int stock;

    public AbstractArticulo(){
        this.staticId++;
        this.precio = 0;
    }

    public AbstractArticulo(int precio){
        this.staticId++;
        this.precio = precio;
    }

    public AbstractArticulo(String marca, float precio, int stock) {
        this.staticId++;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public int getIdInt() {
        return idInt;
    }

    public String getId() {
        return id;
    }

    public AbstractArticulo setStock(int stock) {
        this.stock = stock;
        return this;
    }

    public int getStock() {
        return stock;
    }

    public AbstractArticulo stock(int stock) {
        this.stock = stock;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public AbstractArticulo marca(String marca) {
        this.marca = marca;
        return this;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public float getPrecio(){
        return this.precio;
    }

    public AbstractArticulo precio(float precio){
        this.precio = precio;
        return this;
    }

    public abstract void show();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractArticulo articulo = (AbstractArticulo) o;
        return precio == articulo.precio && Objects.equals(marca, articulo.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, precio);
    }

    @Override
    public String toString() {
        return "AbstractArticulo{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    @Override
    public int compareTo(AbstractArticulo o) {
        return this.getMarca().compareTo(o.getMarca());
    }
}
