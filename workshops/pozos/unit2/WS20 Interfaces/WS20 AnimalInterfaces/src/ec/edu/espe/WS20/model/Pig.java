
package ec.edu.espe.WS20.model;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Pig extends Mammal {
    private float weight;

    public Pig(float weight, int id, String description, String cage) {
        super(id, description, cage);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString()+"Pig{" + "weight=" + weight + '}';
    }

    
    @Override
    public void feed() {
        System.out.println("feeding pig");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("addind this pig to the zoo"+zoo);
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
