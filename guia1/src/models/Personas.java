package models;

import mocks.Mocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.UtilGuia1.getLocalDate;

public class Personas {
    private int v;
    private final int dim;
    private final Persona[] personas;

    public Personas(int dim) {
        this.dim = dim;
        this.v = 0;
        personas = new Persona[this.dim];
        createPersons(dim);
        this.v=dim;
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

    private void createPersons(int n) {
        for (int i = 0; i < n; i++) {
            personas[i]=(i % 2 == 0)?createAlumno():createProfesor();
        }

    }

    private Alumno createAlumno() {
        return (Alumno) new Alumno()
                .legajo(Mocks.getLegajo())
                .carrera(Mocks.getCarrera())
                .name(Mocks.getName())
                .lastName(Mocks.getLastName())
                .age(Mocks.getAge())
                .birthday(getLocalDate(Mocks.getBirthday()));
    }

    private Profesor createProfesor() {
        return (Profesor) new Profesor()
                .asignatura(Mocks.getAsignatura())
                .name(Mocks.getName())
                .lastName(Mocks.getLastName())
                .age(Mocks.getAge())
                .birthday(getLocalDate(Mocks.getBirthday()));
    }
}
