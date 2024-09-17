package models;

import interfaces.IAcuatico;

public class Pez extends Animal implements IAcuatico {

    public Pez(String nombre) {
        super(nombre);
    }

    // Sobreescritura de metodo abstracto de la clase padre
    @Override
    public String emitirSonido() {
        return "gluc gluc gluc";
    }

    // Sobreescritura de la interfaz
    @Override
    public String nadar() {
        return "Soy " + getNombre() + " y estoy nadando gluc gluc";
    }
}
