package models;

import java.util.ArrayList;
import java.util.List;

public class Vehiculos {
    List<Vehiculo> vehiculos;

    public Vehiculos(){
        this.vehiculos = new ArrayList<>();
    }

    public Vehiculos(int size){
        this.vehiculos = new ArrayList<>(size);
    }

    public void add(Vehiculo vehiculo){
        this.vehiculos.add(vehiculo);
    }

    public void show(){
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Autobus) {
                System.out.println("<< Autobus >>");
                ((Autobus) vehiculo).showInfo();
            } else if (vehiculo instanceof Bicicleta) {
                System.out.println("<< Bicicleta >>");
                ((Bicicleta) vehiculo).showInfo();
            } else if(vehiculo instanceof Tranvia){
                System.out.println("<< Tranvia >>");
                ((Tranvia) vehiculo).showInfo();
            }

        }
    }
}
