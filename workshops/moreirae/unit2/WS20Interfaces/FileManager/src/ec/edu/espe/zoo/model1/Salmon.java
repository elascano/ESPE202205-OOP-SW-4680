
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Salmon extends Fish{

    @Override
    public String toString() {
        return "Salmon{" + '}';
    }

    public Salmon(int id, String description, String cage) {
        super(id, description, cage);
    }

    @Override
    public void feed() {
        System.out.println("Feeding a Salmon");
    }

    @Override
    public void addtoZoo(Zoo zoo) {
        System.out.println("Adding a Salmon to the Zoo --> " + zoo);
    }
    
}