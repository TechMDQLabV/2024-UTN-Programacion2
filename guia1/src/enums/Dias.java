package enums;

public enum Dias {
    LUNES("Lunes",1),
    MARTES("Martes",2),
    MIERCOLES("Miércoles",3),
    JUEVES("Jueves",4),
    VIERNES("Viernes", 5),
    SABADO("Sábado", 6),
    DOMINGO("Domingo", 7);

    private String name;
    private int orden;

    private Dias(String name, int orden){
        this.name = name;
        this.orden = orden;
    }

    public String getName(){
        return this.name;
    }

    public int getOrden(){
        return this.orden;
    }
}
