
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
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
        System.out.println("feeding a Salmon");    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("adding a salmon to the Zoo --> "+ zoo);    }
    
}
