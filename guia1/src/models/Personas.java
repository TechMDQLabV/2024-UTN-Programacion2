package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Personas {
    private int v;
    private final int dim;
    private final Persona[] personas;

    public Personas(int dim) {
        this.dim = dim;
        this.v = 0;
        personas = new Persona[this.dim];
    }

    public void mostrar() {
        for (int i = 0; i < this.v; i++) {
            if (personas[i] instanceof Profesor) {
                System.out.println("<< Profesor >>");
            } else if (personas[i] instanceof Alumno) {
                System.out.println("<< Alumno >>");
            }
            System.out.println("Nro de Orden: " + i);
            this.personas[i].imprimir();
            // System.out.println("____________________________________________________");
        }
    }

    public void cargar(Persona p) {
        if (this.v < this.dim) {
            this.personas[v] = p;
            this.v++;
        }
    }

    public void sort() {
        Arrays.sort(personas);
    }

    public Persona getPersona(int index) {
        return this.personas[index];
    }
}
