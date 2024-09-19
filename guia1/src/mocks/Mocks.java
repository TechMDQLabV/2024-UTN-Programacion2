package mocks;

public final class Mocks {
    private static final String[] names = {"Juan", "Pedro", "Maria", "Jose", "Ana", "Lucia", "Carlos", "Fernando", "Luis", "Miguel"};
    private static final String[] lastNames = {"Perez", "Gomez", "Rodriguez", "Fernandez", "Gonzalez", "Alvarez", "Diaz", "Torres", "Lopez", "Sanchez"};
    private static final String[] asignaturas = {"Matematica", "Fisica", "Quimica", "Biologia", "Historia", "Geografia", "Literatura", "Filosofia", "Ingles", "Educacion Fisica"};
    private static final String[] carreras = {"Ingenieria en Sistemas", "Ingenieria en Alimentos", "Ingenieria Quimica", "Ingenieria Civil", "Ingenieria Electrica", "Ingenieria Mecanica", "Ingenieria Industrial", "Ingenieria en Petroleo", "Ingenieria en Minas", "Ingenieria en Telecomunicaciones"};
    private static final String[] legajos = {"1234", "2345", "3456", "4567", "5678", "6789", "7890", "8901", "9012", "0123"};

    public static String getName(){
        return names[(int)(Math.random() * names.length)];
    }

    public static String getLastName(){
        return lastNames[(int)(Math.random() * lastNames.length)];
    }

    public static String getAsignatura(){
        return asignaturas[(int)(Math.random() * asignaturas.length)];
    }

    public static String getCarrera(){
        return carreras[(int)(Math.random() * carreras.length)];
    }

    public static String getLegajo(){
        return legajos[(int)(Math.random() * legajos.length)];
    }

    public static int getAge(){
        return (int)(Math.random() * 100);
    }

    public static String getBirthday(){
        return "2000-01-01";
    }
}
