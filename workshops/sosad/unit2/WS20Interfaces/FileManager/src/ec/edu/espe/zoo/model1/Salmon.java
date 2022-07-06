package ec.edu.espe.zoo.model1;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
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
        System.out.println("feeding a Salmon");
    }

    @Override
    public void addtoZoo(Zoo zoo) {
        System.out.println("adding a Salmon to the Zoo -> " + zoo);
    }
    
}
