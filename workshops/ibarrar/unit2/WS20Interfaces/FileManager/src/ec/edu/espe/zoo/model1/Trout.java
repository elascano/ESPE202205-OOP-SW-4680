package ec.edu.espe.zoo.model1;

/**
 *
 * @author Ronny Ibarra, DCCO-ESPE, Syntax Error
 */
public class Trout extends Fish{

    public Trout(int id, String description, String cage) {
        super(id, description, cage);
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
        System.out.println("adding a Trout to the Zoo -> " + zoo);
    }
    
}
