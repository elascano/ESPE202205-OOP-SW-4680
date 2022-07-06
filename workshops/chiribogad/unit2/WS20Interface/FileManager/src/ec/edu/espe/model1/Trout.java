package ec.edu.espe.model1;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Trout extends Fish{

    public Trout(int id, String descrption, String cage) {
        super(id, descrption, cage);
    }

    @Override
    public String toString() {
        return "Trout{" + '}';
    }

    @Override
    public void feed() {
        System.out.println("feeding a Trout");
    }

    @Override
    public void addtoZoo(Zoo zoo) {
        System.out.println("adding a trout to the Zoo ->" + zoo);
    }

}
