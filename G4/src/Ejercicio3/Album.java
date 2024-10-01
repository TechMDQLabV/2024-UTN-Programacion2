package Ejercicio3;

public class Album {

    private int anioDePublicacion;
    private String titulo;
    private Artista artista;

    //Constructores
    public Album(int anioDePublicacion, Artista artista, String titulo) {
        this.anioDePublicacion = anioDePublicacion;
        this.artista = artista;
        this.titulo = titulo;
    }

    public Album() {
        this.anioDePublicacion = 0;
        this.artista = new Artista();
        this.titulo = "";
    }

    //Getters y Setters
    public int getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public void setAnioDePublicacion(int anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Sobreescrituras

    @Override
    public String toString() {
        return "Album{" +
                "anioDePublicacion=" + anioDePublicacion +
                ", titulo='" + titulo + '\'' +
                ", artista=" + artista +
                '}';
    }
}
