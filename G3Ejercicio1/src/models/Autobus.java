package models;

import enums.TipoTransporte;
import interfaces.Transporte;

public class Autobus extends Vehiculo implements Transporte {

    private int numeroLinea;
    private int capacidad;

    public Autobus(TipoTransporte tipo, int capacidad, int numeroLinea) {
        super(tipo);
        this.capacidad = capacidad;
        this.numeroLinea = numeroLinea;
    }

    @Override
    public String arrancar() {
        return "El autobús de la línea " + numeroLinea + " ha arrancado.";
    }

    @Override
    public String detener() {
        return "El autobús de la línea " + numeroLinea + " se ha detenido.";
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    public String anunciarParada(String parada) {
        return "Próxima parada: " + parada;
    }

    public void showInfo() {
        System.out.println("Nro. de línea....: " + this.numeroLinea);
        System.out.println("Capacidad........: " + this.capacidad);
    }
}
