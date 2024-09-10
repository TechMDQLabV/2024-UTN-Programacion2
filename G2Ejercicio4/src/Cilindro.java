public class Cilindro extends Circulo{

    private double altura;

    // Constructor por defecto
    public Cilindro() {
        super();  // Llama al constructor por defecto de Círculo
        this.altura = 1.0;
    }

    // Constructor con radio y altura
    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    // Constructor con radio, altura y color
    public Cilindro(double radio, double altura, String color) {
        super(radio, color);
        this.altura = altura;
    }

    // Get y Set
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Metodos propios

    // Método para calcular el volumen
    public double calcularVolumen() {
        return super.calcularArea() * altura;  // Usa el área de la base del círculo
    }

    // Sobrescribir el método calcularArea para calcular el área del cilindro
    @Override
    public double calcularArea() {
        return 2 * Math.PI * getRadio() * altura + 2 * super.calcularArea();
    }

    // Método para imprimir las características del cilindro
    @Override
    public String mostrarInfo() {
        return "Cilindro: subclase de " + super.mostrarInfo() + ", altura=" + altura;
    }
}
