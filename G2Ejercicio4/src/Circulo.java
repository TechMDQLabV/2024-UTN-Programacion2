public class Circulo {

    private double radio;
    private String color;

    // Constructor por defecto
    public Circulo() {
        this.radio = 1.0;
        this.color = "rojo";
    }

    // Constructor con radio
    public Circulo(double radio) {
        this.radio = radio;
        this.color = "rojo";
    }

    // Constructor con radio y color
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    // Get y Set
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para imprimir las características del círculo
    public String mostrarInfo() {
        return "Círculo[radio=" + radio + ", color=" + color + "]";
    }
}
