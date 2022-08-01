package ec.edu.espe.zoo.model1;

/**
 *
 * @author Martín Toapanta, ESPE - DCCO, MyWayCode 
 */
public class Salmon extends Fish{

    public Salmon(int id, String description, String cage) {
        super(id, description, cage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Salmon{");
        sb.append('}');
        return sb.toString();
    }

    
    @Override
    public void feed() {
        System.out.println("feeding a Salmon");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("adding a Salmon to the Zoo -> " + zoo);
    }
}
