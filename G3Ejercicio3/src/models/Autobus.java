package models;

public class Autobus extends VehiculoConPasajeros {


    public Autobus(String marca, String modelo, double velocidadMaxima, int capacidadPasajeros) {
        super(marca, modelo, velocidadMaxima, capacidadPasajeros);
    }

    //Sobreescritura opcional
    @Override
    public String avanzar() {
        return "Soy un autobus y" + super.avanzar();
    }

    @Override
    public String detenerse() {
        return "Soy un autobus y" + super.detenerse();
    }

    //Sobreescritura de toString
    @Override
    public String toString() {
        return "models.Autobus: " + super.toString();
    }
}
