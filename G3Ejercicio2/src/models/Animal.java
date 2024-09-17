package models;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String comer() {
        return nombre + " está comiendo.";
    }

    public String dormir() {
        return nombre + " está durmiendo.";
    }

    public abstract String emitirSonido();

    public String getNombre() {
        return nombre;
    }
}
