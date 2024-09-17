package models;

import interfaces.IVehiculo;

public class Bicicleta extends Vehiculo implements IVehiculo {

    private int alturaAsiento;

    public Bicicleta(String marca, String modelo, double velocidadMaxima, int alturaAsiento) {
        super(marca, modelo, velocidadMaxima);
        this.alturaAsiento = alturaAsiento;
    }

    public int getAlturaAsiento() {
        return alturaAsiento;
    }

    public void setAlturaAsiento(int alturaAsiento) {
        this.alturaAsiento = alturaAsiento;
    }

    //Sobreescritura
    @Override
    public String avanzar() {
        return "Soy una bicicleta y estoy avanzando";
    }

    @Override
    public String detenerse() {
        return "Soy una bicicleta y me estoy deteniendo";
    }

    //Sobreescritura de toString
    @Override
    public String toString() {
        return "models.Bicicleta: " + super.toString() +
                ", alturaAsiento=" + alturaAsiento +
                " ";
    }
}
