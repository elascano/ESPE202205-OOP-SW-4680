
package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model1.Animal;
import ec.edu.espe.zoo.model1.Cow;
import ec.edu.espe.zoo.model1.Pig;
import ec.edu.espe.zoo.model1.Salmon;
import ec.edu.espe.zoo.model1.Zoo;
import java.util.ArrayList;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */

public class FileManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal;
        animal = new Cow(3, "Belgian Blue", "cage1");
        System.out.println("animal is " + animal.getClass());
        
        
        Zoo zoo;
        Cow cow;
        Pig pig;
        ArrayList<Animal> animals;
        animals = new ArrayList<>();
        
        zoo = new Zoo("Guayllabamba", animals);
        cow = new Cow(1, "Holstein", "cage1");

        animals.add(cow);
        System.out.println("animal is " + animal.getClass());
        
        pig = new Pig(12.4F, 2, "Danish", "cage2");
        animals.add(pig);
        
        animals.add(animal);
        
        animal = new Salmon(4, "pool", "cage4");
        System.out.println("animal is " + animal.getClass());
        animals.add(animal);
        
        animals.add(animal);
        
        System.out.println("Cow -> " + cow);
        System.out.println("Pig -> " + pig);
        
        System.out.println("Cow id -> " + cow.getId());
        
        cow.feed();
        cow.addtoZoo(zoo);
        
        pig.addtoZoo(zoo);
        pig.feed();
        
        System.out.println("Zoo animals --> " + animals);
    }
    
}
