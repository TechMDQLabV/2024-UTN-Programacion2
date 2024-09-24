package mocks;

import models.Alumno;
import models.Profesor;

import java.util.Random;

import static utils.UtilGuia1.getLocalDate;

public final class Mocks{
    private static final Random random = new Random();
    private static final String[] names = {
            "Juan", "Pedro", "Maria", "Jose", "Ana", "Lucia", "Carlos", "Fernando", "Luis", "Miguel",
            "Sofia", "Martina", "Valentina", "Isabella", "Camila", "Victoria", "Mia", "Ximena", "Sara", "Daniela",
            "Mateo", "Sebastian", "Santiago", "Nicolas", "Samuel", "Gabriel", "Benjamin", "Emiliano", "Joaquin", "Diego",
            "Adrian", "Lucas", "Tomas", "Alejandro", "David", "Emmanuel", "Hugo", "Ivan", "Javier", "Leonardo",
            "Manuel", "Oscar", "Pablo", "Rafael", "Simon", "Victor", "Andres", "Cristian", "Eduardo", "Felipe"
    };
    private static final String[] lastNames = {
            "Perez", "Gomez", "Rodriguez", "Fernandez", "Gonzalez", "Alvarez", "Diaz", "Torres", "Lopez", "Sanchez",
            "Martinez", "Romero", "Sosa", "Ruiz", "Ramirez", "Flores", "Acosta", "Medina", "Herrera", "Aguirre",
            "Pereyra", "Gutierrez", "Molina", "Castro", "Rojas", "Ortiz", "Silva", "Nunez", "Luna", "Suarez",
            "Cabrera", "Rios", "Morales", "Godoy", "Moreno", "Ferreyra", "Dominguez", "Carrizo", "Peralta", "Vega",
            "Castillo", "Mansilla", "Ojeda", "Ibarra", "Navarro", "Vera", "Maldonado", "Ponce", "Villalba", "Cardozo"
    };
    private static final String[] asignaturas = {"Matematica", "Fisica", "Quimica", "Biologia", "Historia", "Geografia", "Literatura", "Filosofia", "Ingles", "Educacion Fisica"};
    private static final String[] carreras = {"Ingenieria en Sistemas", "Ingenieria en Alimentos", "Ingenieria Quimica", "Ingenieria Civil", "Ingenieria Electrica", "Ingenieria Mecanica", "Ingenieria Industrial", "Ingenieria en Petroleo", "Ingenieria en Minas", "Ingenieria en Telecomunicaciones"};
    private static final String[] legajos = {"1234", "2345", "3456", "4567", "5678", "6789", "7890", "8901", "9012", "0123"};
    private static final String[] marcasDeHerramientas = {"Bosch", "Black & Decker", "Dewalt", "Makita", "Stanley", "Hilti", "Milwaukee", "Ryobi", "Hitachi", "Skil"};
    private static final String[] tiposDeHerramientas = {"Taladro", "Sierra", "Martillo", "Llave", "Destornillador", "Pinza", "Alicate", "Cinta Metrica", "Nivel", "Escuadra"};
    private static final String[] tiposDeMateriales = {"Madera", "Metal", "Plastico", "Vidrio", "Cemento", "Piedra", "Carton", "Papel", "Tela", "Cuero"};
    private static final String[] tiposDeDestornilladores = {"Plano", "Phillips", "Torx", "Allen", "Pozidriv", "Tri-Wing", "Spanner", "Robertson", "Clutch", "Torq-Set"};

    private static final int[] precios = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
    private static final int[] anchoTornillos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final int[] largoTornillos = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    public static String getName(){
        return names[random.nextInt(names.length)];
    }

    public static String getLastName(){
        return lastNames[random.nextInt(lastNames.length)];
    }

    public static String getAsignatura(){
        return asignaturas[random.nextInt(asignaturas.length)];
    }

    public static String getCarrera(){
        return carreras[random.nextInt(carreras.length)];
    }

    public static String getLegajo(){
        return legajos[random.nextInt(legajos.length)];
    }

    public static int getAge(){
        return random.nextInt(80);
    }

    public static String getBirthday() {
        return (getYear() + "-" + getMonth() + "-" + getDay());
    }

    public static String getMarcaDeHerramienta(){
        return marcasDeHerramientas[random.nextInt(marcasDeHerramientas.length)];
    }

    public static String getTipoDeHerramienta(){
        return tiposDeHerramientas[random.nextInt(tiposDeHerramientas.length)];
    }

    public static String getTipoDeMaterial(){
        return tiposDeMateriales[random.nextInt(tiposDeMateriales.length)];
    }

    public static int getPrecio(){
        return precios[random.nextInt(precios.length)];
    }

    public static int getAnchoTornillo(){
        return anchoTornillos[random.nextInt(anchoTornillos.length)];
    }

    public static int getLargoTornillo(){
        return largoTornillos[random.nextInt(largoTornillos.length)];
    }

    public static String getTipoDeDestornillador(){
        return tiposDeDestornilladores[random.nextInt(tiposDeDestornilladores.length)];
    }

    public static String getYear(){
        return String.valueOf(random.nextInt(100) + 1900);
    }

    public static String getMonth(){
        String month = String.valueOf(random.nextInt(12) + 1);
        return (month.length()==1) ? "0" + month : month;
    }

    public static String getDay(){
        String day = String.valueOf(random.nextInt(28) + 1);
        return (day.length()==1) ? "0" + day : day;
    }

    public static Alumno createAlumno() {
        return (Alumno) new Alumno()
                .legajo(getLegajo())
                .carrera(getCarrera())
                .name(getName())
                .lastName(getLastName())
                .age(getAge())
                .birthday(getLocalDate(getBirthday()));
    }

    public static Profesor createProfesor() {
        return (Profesor) new Profesor()
                .asignatura(getAsignatura())
                .name(getName())
                .lastName(getLastName())
                .age(getAge())
                .birthday(getLocalDate(getBirthday()));
    }
}
