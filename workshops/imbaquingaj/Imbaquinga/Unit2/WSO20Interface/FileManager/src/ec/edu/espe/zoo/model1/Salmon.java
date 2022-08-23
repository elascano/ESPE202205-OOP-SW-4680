package ec.edu.espe.zoo.model1;

/**
 *
 * @author Jose Imbaquinga, DCCO-ESPE, Syntax Error
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
        System.out.println("feeding a Salmon");
    }

    @Override
    public void addtoZoo(Zoo zoo) {
        System.out.println("adding a Salmon to the Zoo -> " + zoo);
    }
    
}
