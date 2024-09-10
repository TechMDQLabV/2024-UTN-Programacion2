public class EmpleadoPorHora extends  Empleado{

    private int horasTrabajadas;
    private double precioPorHora;

    public EmpleadoPorHora(String nombre, double precioPorHora, int horasTrabajadas) {
        super( precioPorHora * horasTrabajadas, nombre); // No utilizamos salario como tal, ya que el salarioMensual no es fijo en este caso
        this.horasTrabajadas = horasTrabajadas;
        this.precioPorHora = precioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    @Override
    public double calcularPago() {
        return precioPorHora * horasTrabajadas; // Calcula el pago correctamente
    }
}
