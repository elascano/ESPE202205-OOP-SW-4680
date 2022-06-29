
package ec.edu.espe.WS20.view;

import ec.edu.espe.WS20.model.Animal;
import ec.edu.espe.WS20.model.Cow;
import ec.edu.espe.WS20.model.Pig;
import ec.edu.espe.WS20.model.Salmon;
import ec.edu.espe.WS20.model.Zoo;
import java.util.ArrayList;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.MSI
 */
public class WS20Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal;
        animal=new Cow(3,"VacaLola","cage 1");
        
        
        
        Zoo zoo;
        Cow cow;
        Pig pig;
        ArrayList<Animal> animals;
        animals=new ArrayList<>();
        
        zoo = new Zoo("Guayllabamba",animals);
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
