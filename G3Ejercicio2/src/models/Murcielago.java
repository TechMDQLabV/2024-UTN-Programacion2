package models;

import interfaces.IAereo;

public class Murcielago extends Animal implements IAereo {

    public Murcielago(String nombre) {
        super(nombre);
    }

    // Sobreescritura de metodos de la clase padre
    @Override
    public String emitirSonido() {
        return getNombre() + " emite un sonido agudo";
    }

    // Sobreescritura de metodos de la interfaz
    @Override
    public String volar() {
        return "Soy " + getNombre() + " y estoy volando";
    }

    // Metodo propio
    public String colgarse(){
        return "Soy " + getNombre() + " y me cuelgo boca abajo en las cuevas";
    }
}
