package models;

import interfaces.IVehiculoDePasajeros;

public abstract class VehiculoConPasajeros extends Vehiculo implements IVehiculoDePasajeros {

    protected int capacidadPasajeros;

    public VehiculoConPasajeros(String marca, String modelo, double velocidadMaxima, int capacidadPasajeros) {
        super(marca, modelo, velocidadMaxima);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    // Sobreescritura
    @Override
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    @Override
    public void setCapacidadPasajeros(int capacidad) {
        this.capacidadPasajeros = capacidad;
    }

    @Override
    public String avanzar() {
        return " estoy avanzando";
    }

    @Override
    public String detenerse() {
        return " me estoy deteniendo";
    }


    //Sobreescritura de toString
    @Override
    public String toString() {
        return super.toString() +
                ", capacidadPasajeros=" + capacidadPasajeros +
                " " ;
    }
}
