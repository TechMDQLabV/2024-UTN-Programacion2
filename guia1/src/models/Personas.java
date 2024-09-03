package models;

public class Personas {
    private int v;
    private int dim;
    private Persona[] personas;

    public Personas(int dim){
        this.dim = dim;
        this.v = 0;
        personas = new Persona[this.dim];
    }

    public void mostrar(){
        for(int i = 0; i < this.v; i++){
            if(personas[i] instanceof Profesor){
                System.out.println("<< Profesor >>");
            } else if (personas[i] instanceof Alumno){
                System.out.println("<< Alumno >>");
            }
            this.personas[i].imprimir();
            System.out.println("____________________________________________________");
        }
    }

    public void cargar(Persona p){
        if(this.v < this.dim) {
            this.personas[v] = p;
            this.v++;
        }
    }
}
