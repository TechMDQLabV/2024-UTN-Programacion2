package models.mock;

import models.enums.TipoDeMaterial;

import java.util.Random;

public final class Mocks {
    private static final String[] marcas = {"Black & Decker", "Bosch", "Dewalt", "Hilti", "Makita", "Milwaukee", "Ryobi"};
    private static final String[] herramientas = {"Martillo", "Destornillador", "Llave", "Sierra", "Taladro", "Pinza", "Cinta Métrica"};
    private static final String[] modelos = {"Modelo 1", "Modelo 2", "Modelo 3", "Modelo 4", "Modelo 5", "Modelo 6", "Modelo 7"};
    private static final float[] precios = {100.0f, 200.0f, 300.0f, 400.0f, 500.0f, 600.0f, 700.0f};
    private static final int[] stocks = {10, 20, 30, 40, 50, 60, 70};
    private static final boolean[] esInalambricas = {true, false, true, false, true, false, true};
    private static final int[] cantidadPorPaquete = {100, 200, 300, 400, 500, 600, 700};
    private static final int[] longitud = {1, 2, 3, 4, 5, 6, 7};
    private static final Random random = new Random();

    public static String getMarca(){
        return marcas[random.nextInt(marcas.length)];
    }

    public static String getModelo(){
        return modelos[random.nextInt(modelos.length)];
    }

    public static float getPrecio(){
        return precios[random.nextInt(precios.length)];
    }

    public static int getStock(){
        return stocks[random.nextInt(stocks.length)];
    }

    public static boolean getEsInalambrica(){
        return esInalambricas[random.nextInt(esInalambricas.length)];
    }

    public static int getCantidadPorPaquete(){
        return cantidadPorPaquete[random.nextInt(cantidadPorPaquete.length)];
    }

    public static TipoDeMaterial getTipoDeMaterial() {
        TipoDeMaterial[] materiales = TipoDeMaterial.values();
        return materiales[random.nextInt(materiales.length)];
    }

    public static int getLongitud(){
        return longitud[random.nextInt(longitud.length)];
    }

    public static String getHerramienta(){
        return herramientas[random.nextInt(herramientas.length)];
    }
}
