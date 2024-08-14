import models.Persona;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner menuScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        Persona o = new Persona("Juan", "Molina");
        o.setAge(56);
        Persona p = new Persona("Pepe");
        System.out.println(p.getName() + " " + p.getLastName() + " " + p.getAge());
        System.out.println(o.getName() + " " + o.getLastName() + " " + o.getAge());
        p.setName("Moni");
        p.setLastName("Argento");
        System.out.println(p.getName() + " " + p.getLastName());
        System.out.println(o);

        do{
            menu();
            opcion = menuScanner.nextInt();

            switch(opcion){
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

        }while(opcion != 0);
        menuScanner.close();
    }

    private static void menu(){
        System.out.println("\n<<<<<<<<<<<< Menu de Opciones >>>>>>>>>>>>>\n");
        System.out.println("1 - Ejercicio 1");
        System.out.println("2 - Ejercicio 2");
        System.out.println("3 - Ejercicio 3");
        System.out.println("4 - Ejercicio 4");
        System.out.println("5 - Ejercicio 5");
        System.out.println(" ");
        System.out.println("0 para Salir");
    }
/* Realizar un programa Java que realice lo siguiente: declarar una variable
numN de tipo int, una variable numA de tipo double y una variable numC de
tipo char y asigna a cada una un valor. A continuación muestra por pantalla:
El valor de cada variable, la suma de numN + numA, la diferencia de numA -
numN, el valor numérico correspondiente al carácter que contiene la
variable numC.
 */
    private static void ej01(){
        int numI = 666;
        double numD = 2.33;
        char numC = 'c';
        int numChar = numC;

        System.out.printf("el nroI es: %d - el nroD es: %.2f - el numC es: %d ", numI, numD, numChar);
    }

    private static void ejString(){
        String name = "Pepe";
        int[] array = new int[20];
        array[5] = 666;
        char[] c = new char[10];
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for(int i : array){
            System.out.println(i);
        }
       /* for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }*/
    }

}