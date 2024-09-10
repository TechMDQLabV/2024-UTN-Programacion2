public class EmpleadoContratista extends Empleado{

    private int horasTrabajadas;
    private double tarifaPorProyecto;

    public EmpleadoContratista(String nombre, double tarifaPorProyecto, int horasTrabajadas) {
        super(tarifaPorProyecto * horasTrabajadas, nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorProyecto = tarifaPorProyecto;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorProyecto() {
        return tarifaPorProyecto;
    }

    public void setTarifaPorProyecto(double tarifaPorProyecto) {
        this.tarifaPorProyecto = tarifaPorProyecto;
    }

    @Override
    public double calcularPago() {
        return tarifaPorProyecto * horasTrabajadas; // Pago basado en el número de horas y la tarifa
    }
}
