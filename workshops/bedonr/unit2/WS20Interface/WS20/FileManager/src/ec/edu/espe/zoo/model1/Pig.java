
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class Pig extends Mammal {
    
    float weight;

    public Pig(float weight, int id, String description, String cage) {
        super(id, description, cage);
        this.weight = weight;
    }
    
    
    

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

   
    @Override
    public String toString() {
        return super.toString() + "Pig{" + "weight=" + weight + '}';
    }

    
    
    
    @Override
    public void feed() {
        System.out.println("feeding a pig");    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("adding pig to zoo" + zoo);
    }
    
}
