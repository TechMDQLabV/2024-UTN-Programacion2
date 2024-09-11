import enums.TipoTransporte;
import models.Autobus;
import models.Bicicleta;
import models.Tranvia;
import models.Vehiculos;

public class Main {
    public static void main(String[] args) {
        Vehiculos vehiculos = new Vehiculos();

        // Crear instancias de cada clase
        Autobus autobus = new Autobus(TipoTransporte.AUTOBUS, 50, 511);
        Tranvia tranvia = new Tranvia(TipoTransporte.TRANVIA,"Ruta 3", 100);
        Bicicleta bicicleta = new Bicicleta(TipoTransporte.BICICLETA,"B12345");

        vehiculos.add(autobus);
        vehiculos.add(tranvia);
        vehiculos.add(bicicleta);

        System.out.println("\t\t<<< Información de los vehículos >>>");
        vehiculos.show();
        System.out.println("===============================================================");
        // Simular arranque, detención y obtención de la capacidad de cada transporte
        System.out.println(autobus.arrancar());
        System.out.println(autobus.anunciarParada("Plaza Central"));
        System.out.println("Capacidad del autobús: " + autobus.obtenerCapacidad());
        System.out.println(autobus.detener());
        System.out.println("Tipo de transporte: " + autobus.getTipo());

        System.out.println();

        System.out.println(tranvia.arrancar());
        System.out.println(tranvia.cambiarVia(2));
        System.out.println("Capacidad del tranvía: " + tranvia.obtenerCapacidad());
        System.out.println(tranvia.detener());
        System.out.println("Tipo de transporte: " + tranvia.getTipo());

        System.out.println();

        System.out.println(bicicleta.arrancar());
        System.out.println(bicicleta.ajustarAsiento(75));
        System.out.println("Capacidad de la bicicleta: " + bicicleta.obtenerCapacidad());
        System.out.println(bicicleta.detener());
        System.out.println("Tipo de transporte: " + bicicleta.getTipo());
    }

    private static Autobus getAutobus() {
        return new Autobus(TipoTransporte.AUTOBUS, 56, 512);
    }

    private static Tranvia getTranvia() {
        return new Tranvia(TipoTransporte.TRANVIA, "Ruta 4", 120);
    }

    private static Bicicleta getBicicleta() {
        return new Bicicleta(TipoTransporte.BICICLETA, "B54321");
    }
}