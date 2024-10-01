package Ejercicio1;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Libro> libros;

    // Constructor
    public Tienda() {
        this.libros = new ArrayList<>();
    }

    // Metodos propios
    public String agregarLibro(Libro nuevo){
        String mensaje= "";
        if(nuevo != null){
            libros.add(nuevo);
            mensaje = "Libro cargado con exito";
        }else{
            mensaje = "Error";
        }
        return mensaje;
    }

    public String eliminarLibro(Libro libro){
        String mensaje = "";
        if(libro != null){
            libros.remove(libro);
            mensaje = "Libro eliminado con exito";
        }else{
            mensaje = "Libro no encontrado";
        }
        return mensaje;
    }

    public  String mostrarTodos(){
        String mensaje = "";

        for(Libro libroL : libros){
            mensaje += libroL.toString() + "   \n";
        }
        return mensaje;
    }

    public int obtenerPos(String titulo){
        Libro libroAux = new Libro();
        libroAux.setTitulo(titulo);
        int pos = libros.indexOf(libroAux);
        return pos;
    }

    public Libro buscarPorTitulo (String titulo ){
        int pos = obtenerPos(titulo);
        return libros.get(pos);
    }

    public void actualizarPrecioDeLibro(String titulo, double precio){
        int pos = obtenerPos(titulo);
        Libro libroAux = new Libro();
        libroAux = libros.get(pos);
        libroAux.setPrecio(precio);
        libros.set(pos, libroAux);
    }

    public double precioTotal(){
        double total = 0;
        for(Libro librito : libros){
            total += librito.getPrecio();
        }
        return total;
    }

    public int contarTotal(){
        return libros.size();
    }

    public Libro obtenerMasCaro(){
        Libro masCaro = new Libro();
        masCaro = libros.get(0);

        for(Libro librito : libros){
            if(librito.getPrecio() > masCaro.getPrecio()){
                masCaro = librito;
            }
        }
        return masCaro;

    }

    public Libro obtenerMasBarato(){
        Libro masBarato = new Libro();
        masBarato = libros.get(0);

        for(Libro librito : libros){
            if(librito.getPrecio() < masBarato.getPrecio()){
                masBarato = librito;
            }
        }
        return masBarato;

    }

}
