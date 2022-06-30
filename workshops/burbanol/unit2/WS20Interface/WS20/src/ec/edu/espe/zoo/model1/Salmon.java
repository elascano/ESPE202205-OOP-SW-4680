
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Salmon extends Fish{

    public Salmon(int id, String description, String cage) {
        super(id, description, cage);
    }
    
    

    @Override
    public void feed() {
        System.out.println("Feeding a salmon");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("Adding a salmon to zoo -->"+zoo);
    }
    
    
    
}
