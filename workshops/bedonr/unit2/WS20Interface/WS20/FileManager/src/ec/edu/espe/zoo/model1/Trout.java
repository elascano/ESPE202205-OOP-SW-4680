
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class Trout extends Fish {

    @Override
    public void feed() {
        System.out.println("feeding a trout");    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("adding a trout to the Zoo -->" + zoo);    }

    public Trout(int id, String description, String cage) {
        super(id, description, cage);
    }
    
}
