package models;

import models.enums.TipoDeMaterial;

public class Tornillo extends AbstractArticulo {

    private int cantidadPorPaquete;
    private TipoDeMaterial tipoDeMaterial;

    public Tornillo(){
        super();
        this.cantidadPorPaquete = 0;
    }

    public Tornillo(int precio, int cantidad, TipoDeMaterial tipoDeMaterial){
        super(precio);
        this.cantidadPorPaquete = cantidad;
        this.tipoDeMaterial = tipoDeMaterial;
    }

    public void setCantidad(int cantidad){
        this.cantidadPorPaquete = cantidad;
    }

    public int getCantidad(){
        return this.cantidadPorPaquete;
    }

    public Tornillo cantidad(int cantidad){
        this.cantidadPorPaquete = cantidad;
        return this;
    }

    public Tornillo diametro(float diametro){
        return this;
    }

    public void setTipoDeMaterial(TipoDeMaterial tipoDeMaterial){
        this.tipoDeMaterial = tipoDeMaterial;
    }

    public TipoDeMaterial getTipoDeMaterial(){
        return this.tipoDeMaterial;
    }

    public Tornillo tipoDeMaterial(TipoDeMaterial tipoDeMaterial){
        this.tipoDeMaterial = tipoDeMaterial;
        return this;
    }

    public void show(){
        System.out.println("\t\t<<<<< Tornillos >>>>>");
        System.out.println("Id.....................: " + this.getIdInt());
        System.out.println("Id.....................: " + this.getId());
        System.out.println("Marca..................: " + this.getMarca());
        System.out.println("Precio.................: " + this.getPrecio());
        System.out.println("Stock..................: " + this.getStock());
        System.out.println("Cantidad por paquete...: " + this.cantidadPorPaquete);
        System.out.println("Tipo...................: " + this.tipoDeMaterial);
        System.out.println("____________________________________________________________________________________________");
    }

    @Override
    public String toString() {
        return "Tornillos{" +
                "cantidad=" + cantidadPorPaquete +
                ", tipoDeMaterial='" + tipoDeMaterial + '\'' +
                '}';
    }
}
