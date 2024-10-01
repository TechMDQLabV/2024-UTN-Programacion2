package Ejercicio3;

import java.util.Stack;

public class ListaBasica extends ListaDeCanciones implements Reproduccion{
    private Stack<Cancion> miLista;

    public ListaBasica(String nombre) {
        super(nombre);
        this.miLista = new Stack<Cancion>();
    }

    public ListaBasica() {
        super("");
        this.miLista = new Stack<Cancion>();
    }

    // Sobreescrituras
    @Override
    public String reproducir() {
        String mensaje = "";

        if (!miLista.isEmpty()) {
            Cancion cancion = miLista.firstElement(); // La primera canción en el stack

            miLista.remove(0);
            miLista.push(cancion); // Envía la canción al final

            mensaje = "Reproduciendo: " + cancion.toString();

        } else {
            mensaje = "No hay canciones en la lista.";
        }
        return mensaje;
    }

    @Override
    public void añadirCancion(Cancion cancion) {
        miLista.push(cancion);
    }

    @Override
    public String eliminarCancion() {
        return "Para acceder a estas opciones, compre el paquete PREMIUM.";
    }

    @Override
    public String verMiLista() {
        StringBuilder mensaje = new StringBuilder();

        if (miLista.isEmpty()) {
           mensaje = new StringBuilder("La lista está vacía.");
        } else {
            mensaje.append("Lista de reproducción: \n");
            for (Cancion c : miLista) {
                mensaje.append(c.getNombre()).append(" - ");
            }
        }
        return mensaje.toString();
    }

    // Metodos propios
    public String cambiarCancion() {
        return "Para acceder a estas opciones, compre el paquete PREMIUM.";
    }
}
