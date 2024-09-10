public class MiembroStaff extends Persona{

    private double salario;
    private String turno;

    //Constructor
    public MiembroStaff(String dni, String nombre, String apellido, String email, String direccion, double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    // Getters y setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String mostrarInfo() {
        return "Staff[" + super.toString() + ", salario=" + salario + ", turno=" + turno + "]";
    }
}
