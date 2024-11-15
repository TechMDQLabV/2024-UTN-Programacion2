import enums.Dias;
import enums.Mes;
import mocks.Mocks;
import models.*;

import java.util.*;

import static utils.UtilGuia1.getLocalDate;

public class Main {
    private static final Scanner menuScanner = new Scanner(System.in);
    private static int cont = 0;
    private static Personas personas;

    public static void main(String[] args) {
        Object o = new Object();

        int option;
        System.out.println("Fecha: " + getLocalDate(Mocks.getBirthday()));
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
                case 6:
                    probandoObjects();
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
        System.out.println("5 - Probando JSON");
        System.out.println("6 - Probando Object");
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
        personas.cargar(Mocks.createAlumno());
        personas.cargar(Mocks.createProfesor());
        personas.cargar(Mocks.createAlumno());
        personas.cargar(Mocks.createProfesor());
        personas.cargar(Mocks.createAlumno());
        Persona p = Mocks.createProfesor();
        personas.cargar(p);
        personas.cargar(new Profesor()
                .asignatura("Programación II")
                .name("Juan")
                .lastName("Martinez")
                .age(45));
        personas.cargar(Mocks.createAlumno());
        personas.cargar(new Profesor().name("Anibal").lastName("Fernandez"));
        personas.cargar(new Profesor().lastName("Ramirez").age(57));
        personas.mostrar();
        System.out.println(Dias.DOMINGO.getName() + Dias.DOMINGO.getOrden());
        System.out.println("getGenericInterfaces...: " + Arrays.toString(Personas.class.getGenericInterfaces()));
        System.out.println("getAnnotatedInterfaces.3: " + Arrays.toString(Personas.class.getAnnotatedInterfaces()));
    }

    private static void probandoAlumno() {
        Alumno a = Mocks.createAlumno();

        a.imprimir();
    }

    private static void probandoJson() {
        PersonsJSON personsJSON = new PersonsJSON();
        personas = personsJSON.getPersonas();
        personas.sort();
        personas.mostrar();
    }

    private static void probandoObjects() {
        if (personas != null) {
            Persona persona = personas.getPersona(999);
            persona.setName("Sin Nombre");
            persona.setLastName("Sin Apellido");
            personas.mostrar();
        } else {
            System.out.println("Cargue el arreglo");
        }
    }

    private static Alumno cargaAlumno(){
        Alumno a = new Alumno();
        System.out.println("Ingrese los del Alumno");
        System.out.println("Nombre.....: ");
        a.setName(menuScanner.next());
        System.out.println("Apellido...: ");
        a.setLastName(menuScanner.next());
        System.out.println("Edad......: ");
        a.setAge(menuScanner.nextInt());
        System.out.println("Legajo.....: ");
        a.setLegajo(menuScanner.next());
        System.out.println("Carrera....: ");
        a.setCarrera(menuScanner.next());
        return a;
    }
}