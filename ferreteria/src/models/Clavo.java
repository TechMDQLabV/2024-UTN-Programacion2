package models;

public class Clavo extends AbstractArticulo{
    protected int cantidadPorPaquete;
    protected int longitud;

    public Clavo(){
        this.cantidadPorPaquete = 0;
        this.longitud = 0;
    }

    public Clavo(int cantidad, int longitud){
        this.cantidadPorPaquete = cantidad;
        this.longitud = longitud;
    }

    @Override
    public void show() {
        System.out.println("\t\t<<<<< Clavo >>>>>");
        System.out.println("Id.....................: " + this.getIdInt());
        System.out.println("Id.....................: " + this.getId());
        System.out.println("Marca..................: " + this.getMarca());
        System.out.println("Precio.................: " + this.getPrecio());
        System.out.println("Stock..................: " + this.getStock());
        System.out.println("Cantidad por paquete...: " + this.cantidadPorPaquete);
        System.out.println("Longitud...............: " + this.longitud);
        System.out.println("____________________________________________________________________________________________");
    }

    public void setCantidadPorPaquete(int cantidadPorPaquete) {
        this.cantidadPorPaquete = cantidadPorPaquete;
    }

    public int getCantidadPorPaquete() {
        return cantidadPorPaquete;
    }

    public Clavo cantidadPorPaquete(int cantidadPorPaquete) {
        this.cantidadPorPaquete = cantidadPorPaquete;
        return this;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public Clavo longitud(int longitud) {
        this.longitud = longitud;
        return this;
    }

    @Override
    public String toString() {
        return "AbstractClavo{" +
                "cantidadPorPaquete=" + cantidadPorPaquete +
                ", longitud=" + longitud +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
