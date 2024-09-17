package models;

import java.util.ArrayList;
import java.util.List;

public class PersonasList {
    List<Persona> personasList;

    public PersonasList() {
        this.personasList = new ArrayList<>();
    }

    public PersonasList(int size) {
        this.personasList = new ArrayList<>(size);
    }

    public void add(Persona persona) {
        this.personasList.add(persona);
    }

    public void show() {
        for (Persona persona : personasList) {
            if (persona instanceof Profesor) {
                System.out.println("<< Profesor >>");
            } else if (persona instanceof Alumno) {
                System.out.println("<< Alumno >>");
            }
            persona.imprimir();
        }
    }

    public Persona search(String lastName) {
        Persona persona = null;
        for (Persona p : personasList) {
            if (p.getLastName().equals(lastName)) {
                persona = p;
                break;
            }
        }
        return persona;
    }

    public Persona search(Persona p) {
        return personasList.get(personasList.indexOf(p));
    }
}
