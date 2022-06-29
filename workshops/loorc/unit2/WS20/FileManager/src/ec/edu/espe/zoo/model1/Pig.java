
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Pig extends Mammal{

   
   

   
    private float weight;

    public Pig(float weight, int id, String description, String cage) {
        super(id, description, cage);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "Pig{" + "weight=" + weight + '}';
    }
    
    
    
    @Override
    public void feed() {
        System.out.println("Fedding a Pig");   
    }
    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("adding Pig to Zoo -->" +zoo);
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
    

