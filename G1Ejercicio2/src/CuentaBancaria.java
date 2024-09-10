public class CuentaBancaria {
    private String nombre;
    private String identificador;
    private double balance;

    //Constructor
    public CuentaBancaria(String nombre, String identificador, double balance) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.balance = balance;
    }

    //Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Método que representa un deposito de dinero
    public double credito(double deposito){
        balance += deposito;
        return balance;
    }

    // Método que representa una extracción de dinero
    public double debito(double extraccion){
        double dineroRestante = balance - extraccion;

        if(dineroRestante >= 0){
            balance -= extraccion;
        }else{
            System.out.println("El dinero en la cuenta no es suficiente para dicha extracción.");
        }

        return balance;
    }

    // Método que facilite imprimir las caracteristicas del objeto
    public String mostrarInfo() {
        return "CuentaBancaria{" +
                "nombre='" + nombre + '\'' +
                ", identificador='" + identificador + '\'' +
                ", balance=" + balance +
                '}';
    }
}
