package models;

import interfaces.IAcuatico;
import interfaces.IAereo;
import interfaces.ITerrestre;

public class Pato extends Animal implements IAereo, IAcuatico, ITerrestre {

    public Pato(String nombre) {
        super(nombre);
    }

    //Sobreescritura de metodo abstracto de la clase padre
    @Override
    public String emitirSonido() {
        return "cuac cuac cuac";
    }

    //Sobreescritura de metodos de interfaces
    @Override
    public String nadar() {
        return "Soy el pato " + getNombre() + " y estoy nadando";
    }

    @Override
    public String volar() {
        return "Soy el pato " + getNombre() + " y estoy volando";
    }

    @Override
    public String caminar() {
        return "Soy el pato " + getNombre() + " y estoy caminando";
    }
}
