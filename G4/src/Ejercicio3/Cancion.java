package Ejercicio3;

public class Cancion {

    private String nombre;
    private double duracion;
    private GeneroMusical genero;
    private Album album;
    private Artista artistaInvitado;

    // Constructores

    //Con artista invitado
    public Cancion(Album album, Artista artistaInvitado, double duracion, GeneroMusical genero, String nombre) {
        this.album = album;
        this.artistaInvitado = artistaInvitado;
        this.duracion = duracion;
        this.genero = genero;
        this.nombre = nombre;
    }

    //Sin artista invitado
    public Cancion(Album album, double duracion, GeneroMusical genero, String nombre) {
        this.album = album;
        this.artistaInvitado = null;
        this.duracion = duracion;
        this.genero = genero;
        this.nombre = nombre;
    }

    public Cancion() {
        this.album = new Album();
        this.artistaInvitado = null; // Si no tiene artista invitado, este es null
        this.duracion = 0;
        this.genero = GeneroMusical.POP;
        this.nombre = "";
    }

    //Getters y Setters
    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artista getArtistaInvitado() {
        return artistaInvitado;
    }

    public void setArtistaInvitado(Artista artistaInvitado) {
        this.artistaInvitado = artistaInvitado;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Sobreescrituras

    @Override
    public String toString() {
        return "Cancion{" +
                "album=" + album +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", genero=" + genero +
                ", artistaInvitado=" + artistaInvitado +
                '}';
    }
}
