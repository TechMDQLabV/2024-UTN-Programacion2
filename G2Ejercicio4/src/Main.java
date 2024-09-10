
public class Main {
    public static void main(String[] args) {

        // Inicializar un Cilindro y analizar la cadena de constructores
        Cilindro cilindro1 = new Cilindro();
        System.out.println("Cilindro 1:");
        System.out.println("Radio: " + cilindro1.getRadio());
        System.out.println("Altura: " + cilindro1.getAltura());
        System.out.println("Área de la base: " + cilindro1.calcularArea());  // Aquí imprime el área del cilindro
        System.out.println("Volumen: " + cilindro1.calcularVolumen());

        // Inicializar un segundo Cilindro con altura y radio especificados
        Cilindro cilindro2 = new Cilindro(2.0, 5.0);
        System.out.println("\nCilindro 2:");
        System.out.println("Radio: " + cilindro2.getRadio());
        System.out.println("Altura: " + cilindro2.getAltura());
        System.out.println("Área del cilindro: " + cilindro2.calcularArea());
        System.out.println("Volumen: " + cilindro2.calcularVolumen());

        // Imprimir las características del cilindro usando el método sobrescrito
        System.out.println("\nDetalles del Cilindro 2:");
        System.out.println(cilindro2.mostrarInfo());
    }
}