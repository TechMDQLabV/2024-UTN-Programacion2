package Ejercicio3;

public class Artista {

    private String nombre;
    private int edad;
    private String nacionalidad;

    // Constructores
    public Artista(int edad, String nacionalidad, String nombre) {
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
    }

    public Artista() {
        this.edad = 0;
        this.nacionalidad = "";
        this.nombre = "";
    }

    // Getters y Setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Sobreescrituras
    @Override
    public String toString() {
        return "Artista{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
