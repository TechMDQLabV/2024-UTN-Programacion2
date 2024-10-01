package Ejercicio1;

import java.util.Objects;

public class Libro {

    private String titulo;
    private String autor;
    private double precio;
    private int anio;

    // Constructores
    public Libro(int anio, String autor, double precio, String titulo) {
        this.anio = anio;
        this.autor = autor;
        this.precio = precio;
        this.titulo = titulo;
    }

    public Libro() {
        this.anio = 0;
        this.autor = "";
        this.precio = 0;
        this.titulo = "";
    }

    //Get y Set
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Sobreescritura
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titulo);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "anio=" + anio +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                '}';
    }
}
