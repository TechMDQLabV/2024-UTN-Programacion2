import models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        // Crear instancias de vehículos
        Automovil automovil = new Automovil("Toyota", "Corolla", 180, 5);
        Autobus autobus = new Autobus("Mercedes-Benz", "Sprinter", 160, 20);
        Camion camion = new Camion("Volvo", "FH16", 140, 30); // 30 toneladas de carga
        Bicicleta bicicleta = new Bicicleta("Giant", "Escape 3", 25, 80);

        vehiculos.add(automovil);
        vehiculos.add(autobus);
        vehiculos.add(camion);
        vehiculos.add(bicicleta);

        vehiculos.forEach(System.out::println);

        // Mostrar la información de los vehículos

        // Cambiar la capacidad de pasajeros
        automovil.setCapacidadPasajeros(4);
        autobus.setCapacidadPasajeros(25);

        // Cambiar la capacidad de carga
        camion.setCapacidadCarga(35);

        // Avanzar y detenerse
        System.out.println(automovil.avanzar());
        System.out.println(automovil.detenerse());

        System.out.println();

        System.out.println(autobus.avanzar());
        System.out.println(autobus.detenerse());

        System.out.println();

        System.out.println(camion.avanzar());
        System.out.println(camion.detenerse());

        System.out.println();

        System.out.println(bicicleta.avanzar());
        System.out.println(bicicleta.detenerse());

        System.out.println();

        // Mostrar la información actualizada
        System.out.println(automovil);
        System.out.println(autobus);
        System.out.println(camion);
        System.out.println(bicicleta);
    }
}