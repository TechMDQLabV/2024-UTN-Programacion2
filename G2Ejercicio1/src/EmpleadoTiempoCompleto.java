public class EmpleadoTiempoCompleto extends  Empleado{

    public EmpleadoTiempoCompleto(double salarioMensual, String nombre) {
        super(salarioMensual, nombre);
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }
}
