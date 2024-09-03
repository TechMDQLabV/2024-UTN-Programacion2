import enums.Dias;
import enums.Mes;
import models.*;

import java.util.Arrays;
import java.util.Scanner;

import static utils.UtilGuia1.getLocalDate;

public class Main {
    private static final Scanner menuScanner = new Scanner(System.in);
    private static int cont=0;

    public static void main(String[] args) {
        int option;
        System.out.println("2017-02-09T10:43:19.667Z".substring(0, 10));
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
                    probandoPersonas();
                    break;
                case 4:
                    probandoAlumno();
                    break;
                case 5:
                    probandoJson();
                    break;
            }
        } while (option != 0);
        menuScanner.close();
    }

    private static void menu() {
        System.out.println("\n\t\t\t<<<<<<<<<<<< Menu de Opciones >>>>>>>>>>>>>\n");
        System.out.println("1 - Ej 1");
        System.out.println("2 - Ej toString");
        System.out.println("3 - Ej Personas");
        System.out.println("4 - Ej Alumno");
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

    private static void probandoPersonas() {

        Personas personas = new Personas(100);
        personas.cargar(createAlumno());
        personas.cargar(createProfesor());
        personas.cargar(createAlumno());
        personas.cargar(createProfesor());
        personas.cargar(createAlumno());
        Persona p = createProfesor();
        personas.cargar(p);
        personas.cargar(new Profesor()
                .name("Juan")
                .lastName("Martinez")
                .age(45));
        personas.cargar(createAlumno());
        personas.cargar(new Profesor().name("Anibal"));
        personas.cargar(new Profesor().lastName("Ramirez").age(57));
        personas.mostrar();
        System.out.println(Dias.DOMINGO.getName() + Dias.DOMINGO.getOrden());
    }

    private static void probandoAlumno() {
        Alumno a = createAlumno();

        a.imprimir();
    }

    private static Alumno createAlumno(){
        return (Alumno) new Alumno()
                .legajo("234")
                .carrera("TUP")
                .name("Juan"+cont)
                .lastName("Ramirez"+cont++)
                .age(23)
                .birthday(getLocalDate("2004-04-04"));
    }

    private static Profesor createProfesor(){
        return (Profesor) new Profesor()
                .name("Pepe"+cont)
                .lastName("Argento"+cont++)
                .age(56)
                .birthday(getLocalDate("2017-02-09T10:43:19.667Z"));
    }

    private static void probandoJson(){
        PersonsJSON personsJSON = new PersonsJSON();
        Personas personas = personsJSON.getPersonas();
        personas.mostrar();
    }
}