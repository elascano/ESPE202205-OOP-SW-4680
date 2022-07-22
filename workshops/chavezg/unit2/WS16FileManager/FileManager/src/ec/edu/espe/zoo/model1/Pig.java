/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class Pig extends Mammal{
    float weight;

    public Pig(float weight, int id, String description, String cage) {
        super(id, description, cage);
        this.weight = weight;
    }

    public Pig(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" + "weight=" + weight + '}';
    }
    
        @Override
    public void feed() {
        System.out.println("Fedding a pig");    }

    @Override
    public void addtoZoo(Zoo zoo) {
        System.out.println("Adding a pig to zoo");    }
}
