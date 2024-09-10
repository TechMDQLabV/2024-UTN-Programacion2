public class Estudiante extends Persona{

    private int anioIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(String dni, String nombre, String apellido, String email, String direccion, int anioIngreso, double cuotaMensual, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioIngreso = this.anioIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    // Getters y setters
    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    @Override
    public String mostrarInfo() {
        return "Estudiante[" + super.toString() + ", añoIngreso=" + anioIngreso +
                ", cuotaMensual=" + cuotaMensual + ", carrera=" + carrera + "]";
    }
}
