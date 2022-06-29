
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
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
        System.out.println("Feeding a Trout");
    }

    @Override
    public void addtoZoo(Zoo zoo) {
        System.out.println("Adding a Trout to the zoo --> " + zoo);
    }
}
