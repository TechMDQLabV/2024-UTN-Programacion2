package models;

import enums.TipoTransporte;
import interfaces.Transporte;

public class Tranvia extends Vehiculo implements Transporte {

    private String ruta;
    private int capacidad;

    public Tranvia(TipoTransporte tipo, String ruta, int capacidad) {
        super(tipo);
        this.ruta = ruta;
        this.capacidad = capacidad;
    }

    @Override
    public String arrancar() {
        return "El tranvía en la ruta " + ruta + " ha arrancado.";
    }

    @Override
    public String detener() {
        return "El tranvía en la ruta " + ruta + " se ha detenido.";
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    public String cambiarVia(int nuevaVia) {
        return "El tranvía ha cambiado a la vía " + nuevaVia + ".";
    }

    public void showInfo() {
        System.out.println("Ruta.............: " + this.ruta);
        System.out.println("Capacidad........: " + this.capacidad);
    }
}
