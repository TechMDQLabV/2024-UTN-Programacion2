public abstract class Empleado {
    protected String nombre;
    protected double salarioMensual;

    public Empleado(double salarioMensual, String nombre) {
        this.salarioMensual = salarioMensual;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setsalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public abstract double calcularPago();
}
