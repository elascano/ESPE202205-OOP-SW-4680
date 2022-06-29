
package ec.edu.espe.WS20.model;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Salmon extends Fish{

    public Salmon(int id, String description, String cage) {
        super(id, description, cage);
    }

    @Override
    public String toString() {
        return "Salmon{" + '}';
    }

   
    @Override
    public void feed() {
        System.out.println("feeding salmon");
    }

    @Override
    public void addToZoo(Zoo zoo) {
         System.out.println("addind this salmon to the zoo"+zoo);
    }
    
}
