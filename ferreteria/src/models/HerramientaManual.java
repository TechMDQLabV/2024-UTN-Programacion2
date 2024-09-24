package models;

public class HerramientaManual extends AbstractHerramienta {
    private String herramienta;

    public HerramientaManual() {
    }

    public HerramientaManual(String marca, float precio, int stock, String modelo) {
        super(marca, precio, stock, modelo);
    }

    public void setHerramienta(String herramienta) {
        this.herramienta = herramienta;
    }

    public String getHerramienta() {
        return herramienta;
    }

    public HerramientaManual herramienta(String herramienta) {
        this.herramienta = herramienta;
        return this;
    }

    @Override
    public void show() {
        System.out.println("\t\t<<<<< Herramienta Manual >>>>>");
        System.out.println("Id.....................: " + this.getIdInt());
        System.out.println("Id.....................: " + this.getId());
        System.out.println("Marca..................: " + this.getMarca());
        System.out.println("Precio.................: " + this.getPrecio());
        System.out.println("Stock..................: " + this.getStock());
        System.out.println("Modelo.................: " + this.getModelo());
        System.out.println("Herramienta............: " + this.herramienta);
        System.out.println("____________________________________________________________________________________________");
    }


    @Override
    public String toString() {
        return "HerramientaManual{" +
                "herramienta='" + herramienta + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
