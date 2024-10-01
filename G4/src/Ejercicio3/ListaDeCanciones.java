package Ejercicio3;

public class ListaDeCanciones {
    private String nombre;

    public ListaDeCanciones(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ListaDeCanciones{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
