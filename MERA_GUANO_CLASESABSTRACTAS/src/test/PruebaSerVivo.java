
package test;

import dominio.AnimalCarnivoro;
import dominio.AnimalHerbivoro;
import dominio.Planta;

public class PruebaSerVivo {
    public static void main(String[] args) {
        
        Planta planta = new Planta();
        planta.setNombreSV("PLANTAS");
        System.out.println(planta.getNombreSV());
        planta.alimentarse();
        System.out.println("");
        
        AnimalCarnivoro animalC = new AnimalCarnivoro();
        animalC.setNombreSV("ANIMALES CARNIVOROS");
        System.out.println(animalC.getNombreSV());
        animalC.alimentarse();
        System.out.println("");
        
        AnimalHerbivoro animalH= new AnimalHerbivoro();
        animalH.setNombreSV("ANIMALES HERBIVOROS");
        System.out.println(animalH.getNombreSV());
        animalH.alimentarse();  
        
    }
}
