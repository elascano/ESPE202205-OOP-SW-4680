/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
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
        System.out.println("Feeding the pig");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("Adding Pig to Zoo--->"+ zoo);
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
