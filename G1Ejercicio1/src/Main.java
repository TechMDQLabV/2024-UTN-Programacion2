
public class Main {
    public static void main(String[] args) {

        // Inciso a
        Empleado empleado1 = new Empleado("Carlos","Gutierrez", "23456345", 25000);

        // Inciso b
        Empleado empleado2 = new Empleado("Ana", "Sanchez", "34234123", 27500);

        // Inciso c
        System.out.println(empleado1.mostrarInfo());
        System.out.println(empleado2.mostrarInfo());

        //Inciso d
        empleado1.aumentarSalario(15);

        double salarioAnual = empleado1.salarioAnual();
        System.out.println("El salario anual de " + empleado1.getNombre() + " es de: " + salarioAnual);
    }
}