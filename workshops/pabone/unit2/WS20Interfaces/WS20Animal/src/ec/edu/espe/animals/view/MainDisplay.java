package ec.edu.espe.animals.view;

import ec.edu.espe.animals.model.Pig;
import ec.edu.espe.animals.model.Salmon;
import ec.edu.espe.animals.model.Zoo;
import ec.edu.espe.animals.model.Animal;
import ec.edu.espe.animals.model.Cow;
import java.util.ArrayList;

/**
 *
 * @author Elkin Pabon, DCCO-ESPE, DEES Developers
 */

public class MainDisplay {

    public static void main(String[] args) {
        Animal animal;
        animal=new Cow(3,"Vaca","cage 1");

        Zoo zoo;
        Cow cow;
        Pig pig;
        ArrayList<Animal> animals;
        animals=new ArrayList<>();
        
        zoo = new Zoo("Quinche",animals);
        cow = new Cow(1,"Holstein","cage1");
        pig = new Pig(12.4F,2,"Danish","cage2");
        animals.add(cow);
        System.out.println("animal is :"+animal.getClass());
        
        animals.add(pig);
        animals.add(animal);
        animal = new Salmon(4,"pool","cage4");
        animals.add(animal);
        
        System.out.println("cow id--->"+cow);
        System.out.println("pig --->"+pig);
        System.out.println("cow id--->"+cow.getId());
        System.out.println("pig --->"+pig.getId());
        
        cow.feed();
        cow.addToZoo(zoo);
        pig.feed();
        pig.addToZoo(zoo);
        
        System.out.println("Zoo-->"+animals);
    }
    
}
