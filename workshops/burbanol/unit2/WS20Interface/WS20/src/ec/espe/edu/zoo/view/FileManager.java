package ec.espe.edu.zoo.view;

import ec.edu.espe.zoo.model1.Animal;
import ec.edu.espe.zoo.model1.Cow;
import ec.edu.espe.zoo.model1.Pig;
import ec.edu.espe.zoo.model1.Zoo;
import java.util.ArrayList;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class FileManager {

    public static void main(String[] args) {
        Zoo zoo;
        Cow cow;
        Pig pig;
        Animal animal;
        ArrayList<Animal> animals;
        
        animals = new ArrayList<>();
        pig = new Pig(12.2F, 2, "Danish", "cage2");
        cow = new Cow(1, "Holstein", "cage1");
        zoo = new Zoo("guayabamba", animals);
        animal = new Cow(3, "Belgian Blue", "cage1");
        
        
        animals.add(pig);
        animals.add(cow);
        System.out.println("Pig ->"+ pig);
        System.out.println("cow ->"+ cow);
        System.out.println("zoo ->"+ zoo);
    }

}
