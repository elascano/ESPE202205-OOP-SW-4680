package ec.edu.espe.model1;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Salmon extends Fish{

    @Override
    public String toString() {
        return "Salmon{" + '}';
    }

    public Salmon(int id, String descrption, String cage) {
        super(id, descrption, cage);
    }

    @Override
    public void feed(){
        System.out.println("feeding a Salmon");
    }

    @Override
    public void addtoZoo(Zoo zoo) {
        System.out.println("adding a Salmon to the Zoo ->" + zoo);
    }
    
}
