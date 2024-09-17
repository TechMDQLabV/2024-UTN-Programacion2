package models;

public class Automovil extends VehiculoConPasajeros{

    public Automovil(String marca, String modelo, double velocidadMaxima, int capacidadPasajeros) {
        super(marca, modelo, velocidadMaxima, capacidadPasajeros);
    }

    //Sobreescritura opcional
    @Override
    public String avanzar() {
        return "Soy un automovil y" + super.avanzar();
    }

    @Override
    public String detenerse() {
        return "Soy un automovil y" + super.detenerse();
    }


    //Sobreescritura de toString
    @Override
    public String toString() {
        return "models.Automovil: " + super.toString();
    }
}
