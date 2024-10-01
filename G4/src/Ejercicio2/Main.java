package Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Persona> personas = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        // Pedir los datos
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el sexo de la persona: ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Ingrese el peso de la persona: ");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la altura de la persona: ");
        double altura = scanner.nextDouble();

        // Crear los objetos
        Persona persona1 = new Persona(altura, edad, nombre, peso, sexo);
        Persona persona2 = new Persona(edad, nombre, sexo);
        Persona persona3 = new Persona();

        // usar los set para guardarle datos al ultimo objeto
        persona3.setNombre("Lautaro");
        persona3.setEdad(25);
        persona3.setAltura(1.80);
        persona3.setSexo('m');
        persona3.setPeso(75.3);

        //Agregar objetos a la collection
        personas.put(persona1.getDni(), persona1);
        personas.put(persona2.getDni(), persona2);
        personas.put(persona3.getDni(), persona3);

        // Mostrar y verificar el IMC de cada persona
        for (Persona p : personas.values()) {

            int imc = p.calcularIMC();

            switch (imc) {
                case -1:
                    System.out.println(p.getNombre() + " está por debajo de su peso ideal.");
                    break;
                case 0:
                    System.out.println(p.getNombre() + " está en su peso ideal.");
                    break;
                case 1:
                    System.out.println(p.getNombre() + " tiene sobrepeso.");
                    break;
            }

        }
    }
}
