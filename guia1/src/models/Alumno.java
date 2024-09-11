package models;

public class Alumno extends Persona {
    private String legajo;
    private String carrera;

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLegajo() {
        return legajo;
    }

    public Alumno legajo(String legajo) {
        this.legajo = legajo;
        return this;
    }

    public String getCarrera() {
        return carrera;
    }

    public Alumno carrera(String carrera) {
        this.carrera = carrera;
        return this;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Legajo......: " + this.legajo);
        System.out.println("Carrera.....: " + this.carrera);
        System.out.println("______________________________________________");
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "legajo='" + legajo + '\'' +
                ", carrera='" + carrera + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Alumno alumno = (Alumno) o;
        return legajo.equals(alumno.legajo);
    }

    @Override
    public int hashCode() {
        return legajo.hashCode();
    }
}
