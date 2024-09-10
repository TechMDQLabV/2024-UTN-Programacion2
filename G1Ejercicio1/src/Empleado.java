public class Empleado {
    private String nombre;
    private String apellido;
    private String dni;
    private double salario;

    //Constructor
    public Empleado(String nombre, String apellido, String dni, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
    }

    //Get and Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para calcular el salario anual
    public double salarioAnual(){
        return salario * 12;
    }

    // Método para aumentar el salario según un porcentaje
    public String aumentarSalario(double porcentaje) {
        String mensaje;

        if (porcentaje > 0) {
            salario += salario * (porcentaje / 100);
            mensaje = "Salario actualizado correctamente.";
        } else {
            mensaje = "El porcentaje debe ser mayor a 0";
        }

        return mensaje;
    }

    // Método que facilita mostrar las caracteristicas del objeto
    public String mostrarInfo() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", salario=" + salario +
                '}';
    }
}
