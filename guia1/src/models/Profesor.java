package models;

import java.util.Objects;

public class Profesor extends Persona{
    private String asignatura;


    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public Profesor asignatura(String asignatura) {
        this.asignatura = asignatura;
        return this;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Asignatura...: " + this.asignatura);
        System.out.println("______________________________________________");
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Profesor profesor)) return false;

        return Objects.equals(asignatura, profesor.asignatura);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(asignatura);
        return result;
    }
}
