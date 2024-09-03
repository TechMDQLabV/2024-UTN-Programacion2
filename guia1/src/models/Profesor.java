package models;

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
}
