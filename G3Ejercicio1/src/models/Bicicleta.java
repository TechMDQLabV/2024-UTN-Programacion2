package models;

import enums.TipoTransporte;
import interfaces.Transporte;

public class Bicicleta extends Vehiculo implements Transporte {

    private String numeroSerie;

    public Bicicleta(TipoTransporte tipo, String numeroSerie) {
        super(tipo);
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String arrancar() {
        return "La bicicleta con número de serie " + numeroSerie + " ha arrancado.";
    }

    @Override
    public String detener() {
        return "La bicicleta con número de serie " + numeroSerie + " se ha detenido.";
    }

    @Override
    public int obtenerCapacidad() {
        return 1; // Capacidad para una persona
    }

    public String ajustarAsiento(int altura) {
        return "La altura del asiento se ha ajustado a " + altura + " cm.";
    }

    public void showInfo() {
        System.out.println("Nro. de serie....: " + this.numeroSerie);
    }
}
