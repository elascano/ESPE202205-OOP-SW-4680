package ec.edu.espe.model1;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Pig extends Mammal{

    @Override
    public String toString() {
        
        return super.toString() + " -> Pig{" + "weight=" + weight + '}';
    }

    public Pig(float weight, int id, String descrption, String cage) {
        super(id, descrption, cage);
        this.weight = weight;
    }

    private float weight;
    
    @Override
    public void feed() {
        System.out.println("feeding a pig");
    }

    @Override
    public void addtoZoo(Zoo zoo) {
        System.out.println("adding Pig to Zoo ->" + zoo);
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
}
