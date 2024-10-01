package Ejercicio3;

import java.util.ArrayList;

public class Spotify {

    private ArrayList<Cancion> canciones;
    private ListaBasica listaBasica;
    private ListaPremium listaPremium;
    private String tipoCuenta;

    public Spotify() {
        this.canciones = new ArrayList<>();
        this.listaBasica = new ListaBasica();
        this.listaPremium = new ListaPremium();
    }

    public String setTipoCuenta(String tipoCuenta) {
        String mensaje = "";
        if (!tipoCuenta.equalsIgnoreCase("Basico") && !tipoCuenta.equalsIgnoreCase("Premium")) {
            mensaje = "Tipo de cuenta no válido. Debe ser 'Básico' o 'Premium'.";
        } else {
            this.tipoCuenta = tipoCuenta;
            inicializarLista();
            mensaje = "Tipo de cuenta cargado con exito!";
        }
        return mensaje;
    }

    private void inicializarLista() {
        if (tipoCuenta.equalsIgnoreCase("Basico")) {
            this.listaBasica = new ListaBasica("Mi Lista Básica");
            this.listaPremium = null;
        } else if (tipoCuenta.equalsIgnoreCase("Premium")) {
            this.listaPremium = new ListaPremium("Mi Lista Premium");
            this.listaBasica = null;
        }
    }

    // Método para añadir canción al ArrayList general de canciones
    public String agregarCancion(Cancion cancion) {
        if (tipoCuenta.equalsIgnoreCase("basico")) {
            listaBasica.añadirCancion(cancion);
        }
        if (tipoCuenta.equalsIgnoreCase("premium")) {
            listaPremium.añadirCancion(cancion);
        }
        return "Cancion agregada con exito! ";
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    // Método para acceder a la lista de reproducción del usuario (retorna la interfaz Reproduccion)
    public ListaDeCanciones getListaUsuario() {
        if (tipoCuenta.equalsIgnoreCase("basico")) {
            return listaBasica;
        } else if (tipoCuenta.equalsIgnoreCase("Premium")) {
            return listaPremium;
        }
        return null;
    }

    // Método para añadir canción al ArrayList general de canciones
    public String eliminarCancion() {
        String mensaje = "";

        if (tipoCuenta.equalsIgnoreCase("basico")) {
            mensaje = listaBasica.eliminarCancion();
        }
        if (tipoCuenta.equalsIgnoreCase("premium")) {
            mensaje = listaPremium.eliminarCancion();
        }
        return mensaje;

    }

    public String reproducir() {
        String mensaje = "";

        if (tipoCuenta.equalsIgnoreCase("basico")) {
            mensaje = listaBasica.reproducir();
        }
        if (tipoCuenta.equalsIgnoreCase("premium")) {
            mensaje = listaPremium.reproducir();
        }
        return mensaje;
    }

    public String verCanciones() {
        String mensaje = "";

        if (tipoCuenta.equalsIgnoreCase("basico")) {
            mensaje = listaBasica.verMiLista();
        }
        if (tipoCuenta.equalsIgnoreCase("premium")) {
            mensaje = listaPremium.verMiLista();
        }
        return mensaje;
    }



}
