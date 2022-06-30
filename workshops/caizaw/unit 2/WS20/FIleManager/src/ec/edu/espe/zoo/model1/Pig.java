/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
public class Pig extends Mammal{

    @Override
    public String toString() {
        
        return super.toString() + " -> Pig{" + "weight=" + weight + '}';
    }

    public Pig(float weight, int id, String description, String cage) {
        super(id, description, cage);
        this.weight = weight;
    }

    private float weight;
    
    @Override
    public void feed() {
        System.out.println("feeding a pig");
    }

    @Override
    public void addtoZoo(Zoo zoo) {
        System.out.println("adding Pig to Zoo -> " + zoo);
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
