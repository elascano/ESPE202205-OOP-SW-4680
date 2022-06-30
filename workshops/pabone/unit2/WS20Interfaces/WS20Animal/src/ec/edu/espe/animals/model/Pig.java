package ec.edu.espe.animals.model;

/**
 *
 * @author Elkin Pabon, DCCO-ESPE, DEES Developers
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
