package fileManager;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Cow;
import ec.edu.espe.zoo.model.Pig;
import ec.edu.espe.zoo.model.Zoo;
import java.util.ArrayList;



/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class FileManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Zoo zoo;
        Cow cow;
        Pig pig;
        ArrayList<Animal>animals;
        animals = new ArrayList<>();
        
        zoo = new Zoo("Guayabamba", animals);
        cow = new Cow(1, "Hols", "cage");
        
       
        animals.add(cow);
        
        pig = new Pig(12.4F, 2, "Danish", "Cage 02");
        animals.add(pig);
        
        System.out.println("Cow--->"+cow);
        System.out.println("Pig--->"+pig);
        
        System.out.println("Cow id--->"+cow.getId());
        
        cow.feed();
        cow.addToZoo(zoo);
        
        pig.addToZoo(zoo);
        pig.feed();
        
        
    }
    
}
