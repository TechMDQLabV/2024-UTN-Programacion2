import models.Persona;
import models.Personas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner menuScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        Persona p = new Persona()
                .name("Pepe")
                .lastName("Argento")
                .age(56);

        p.imprimir();

        Personas personas = new Personas(100);
        personas.cargar(p);
        personas.cargar(new Persona()
                .name("Juana")
                .lastName("Molina")
                .age(45));
        personas.cargar(new Persona().name("Anibal"));
        personas.cargar(new Persona().lastName("Ramirez").age(57));
        personas.mostrar();

        do {
            menu();
            option = menuScanner.nextInt();

            switch (option) {
                case 1:
                    ej01();
                    break;
                case 2:
                    ejString();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (option != 0);
        menuScanner.close();
    }

    private static void menu() {
        System.out.println("\n\t\t\t<<<<<<<<<<<< Menu de Opciones >>>>>>>>>>>>>\n");
        System.out.println("1 - Ej 1");
        System.out.println("2 - Ej 2");
        System.out.println("3 - Ej 3");
        System.out.println("4 - Ej 4");
        System.out.println("5 - Ej 5");
        System.out.println(" ");
        System.out.println("0 para Salir");
    }

    private static void ej01() {
        int numI = 666;
        double numD = 2.33;
        char numC = 'c';
        int numChar = numC;

        System.out.printf("el nroI es: %d - el nroD es: %.2f - el numC es: %d ", numI, numD, numChar);
    }

    private static void ejString() {
        String name = "Pepe";
        int[] array = new int[20];
        array[5] = 666;
        char[] c = new char[10];

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i : array) {
            System.out.println(i);
        }
    }
}