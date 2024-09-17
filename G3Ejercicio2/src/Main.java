import models.Animal;
import models.Murcielago;
import models.Pato;
import models.Pez;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear instancias de cada animal
        Pato pato = new Pato("Donald");
        Murcielago murcielago = new Murcielago("Bruce");
        Pez pez = new Pez("Nemo");

        List<Animal> animales = new ArrayList<>();
        animales.add(pato);
        animales.add(murcielago);
        animales.add(pez);

        showListAnimals(animales);

        boolean existe = animales.contains(murcielago);
        System.out.println("Existe: " + existe);
        // Simular actividades
        System.out.println(pato.comer());
        System.out.println(pato.caminar());
        System.out.println(pato.nadar());
        System.out.println(pato.volar());
        System.out.println(pato.emitirSonido());

        System.out.println();

        System.out.println(murcielago.comer());
        System.out.println(murcielago.volar());
        System.out.println(murcielago.colgarse());
        System.out.println(murcielago.emitirSonido());

        System.out.println();

        System.out.println(pez.comer());
        System.out.println(pez.nadar());
        System.out.println(pez.emitirSonido());
    }

    private static void showListAnimals(List<Animal> animales){
        for(Animal animal : animales) {
            System.out.println(animal.emitirSonido());
            if(animal instanceof Pato) {
                System.out.println(((Pato) animal).volar());
            } else if(animal instanceof Murcielago) {
                System.out.println(((Murcielago) animal).volar());
            } else if(animal instanceof Pez) {
                System.out.println(((Pez) animal).nadar());
            }
        }
    }
}