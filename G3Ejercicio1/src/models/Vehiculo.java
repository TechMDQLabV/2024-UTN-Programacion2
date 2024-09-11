package models;

import enums.TipoTransporte;

public abstract class Vehiculo {
    private TipoTransporte tipo;

    public Vehiculo(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }
}
