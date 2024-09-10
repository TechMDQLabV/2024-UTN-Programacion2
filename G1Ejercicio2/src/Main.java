
public class Main {
    public static void main(String[] args) {

        // Inciso 1
        CuentaBancaria cuenta1 = new CuentaBancaria("Lucrecia", "123", 15000);

        // Inciso 2
        cuenta1.credito(2500);

        // Inciso 3
        cuenta1.debito(1500);

        // Inciso 4
        cuenta1.debito(30000);

        // Inciso 5
        System.out.println(cuenta1.mostrarInfo());
    }
}