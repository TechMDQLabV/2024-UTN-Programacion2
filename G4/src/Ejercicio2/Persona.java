package Ejercicio2;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    private static final char SEXOPORDEFECTO = 'h';
    private static final int PESO_BAJO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;

    // Constructores
    public Persona(double altura, int edad, String nombre, double peso, char sexo) {
        this.altura = altura;
        this.dni = generaDNI();
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
    }

    public Persona(int edad, String nombre, char sexo) {
        this.altura = 0;
        this.dni = generaDNI();
        this.edad = edad;
        this.nombre = nombre;
        this.peso = 0;
        this.sexo = sexo;
    }

    public Persona() {
        this.altura = 0;
        this.dni = 0;
        this.edad = 0;
        this.nombre = "";
        this.peso = 0;
        this.sexo = SEXOPORDEFECTO;
    }

    // Getters y Setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // Metodos propios

    public int calcularIMC() {
        if (altura == 0) {
            return PESO_IDEAL;  // Previene división por cero
        }

        double imc = peso / (altura * altura);

        if (imc < 20) {
            return PESO_BAJO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return SEXOPORDEFECTO;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "altura=" + altura +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", peso=" + peso +
                '}';
    }


    private int generaDNI() {
        Random rand = new Random();
        return rand.nextInt(90000000) + 10000000;
    }
}
