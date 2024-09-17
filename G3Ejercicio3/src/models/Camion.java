package models;

import interfaces.IVehiculoDeCarga;

public class Camion extends Vehiculo implements IVehiculoDeCarga {

    private double capacidadCarga;

    public Camion(String marca, String modelo, double velocidadMaxima, double capacidadCarga) {
        super(marca, modelo, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    // Sobreescritura de metodo de la interfaz
    @Override
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public void setCapacidadCarga(int capacidad) {
        this.capacidadCarga = capacidad;
    }

    @Override
    public String avanzar() {
        return "Soy un camion y estoy avanzando";
    }

    @Override
    public String detenerse() {
        return "Soy un camion y me estoy deteniendo";
    }

    //Sobreescritura de toString
    @Override
    public String toString() {
        return "models.Camion: " + super.toString() +
                ", capacidadCarga=" + capacidadCarga +
                " ";
    }
}
