package models;

public class HerramientaElectrica extends AbstractHerramienta {
    private boolean esInalambrica;

    public HerramientaElectrica() {
    }

    @Override
    public void show() {
        System.out.println("\t\t<<<<< Herramienta Electrica >>>>>");
        System.out.println("Id.....................: " + this.getIdInt());
        System.out.println("Id.....................: " + this.getId());
        System.out.println("Marca..................: " + this.getMarca());
        System.out.println("Precio.................: " + this.getPrecio());
        System.out.println("Stock..................: " + this.getStock());
        System.out.println("Es inalambrica.........: " + ((this.esInalambrica) ? "Si" : "No"));
        System.out.println("____________________________________________________________________________________________");
    }

    public void setEsInalambrica(boolean esInalambrica) {
        this.esInalambrica = esInalambrica;
    }

    public boolean isEsInalambrica() {
        return esInalambrica;
    }

    public HerramientaElectrica esInalambrica(boolean esInalambrica) {
        this.esInalambrica = esInalambrica;
        return this;
    }

    @Override
    public String toString() {
        return "HerramientaElectrica{" +
                "esInalambrica=" + esInalambrica +
                '}';
    }
}
