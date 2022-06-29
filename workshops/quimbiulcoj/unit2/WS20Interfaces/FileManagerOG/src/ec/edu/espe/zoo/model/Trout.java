
package ec.edu.espe.zoo.model;

/**
 *
 * @author Quimbiulco Juan, DCCO-ESPE
 */
public class Trout extends Fish {

    public Trout(int id, String description, String cage) {
        super(id, description, cage);
    }

    @Override
    public String toString() {
        return "Trout{" + '}';
    }

    @Override
    public void feed() {
        System.out.println("feeding trout");
    }

    @Override
    public void addToZoo(Zoo zoo) {
         System.out.println("addind this trout to the zoo"+zoo);
    }
    
}
