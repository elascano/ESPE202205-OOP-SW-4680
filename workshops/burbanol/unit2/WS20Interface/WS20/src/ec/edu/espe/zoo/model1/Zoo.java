
package ec.edu.espe.zoo.model1;

import java.util.ArrayList;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Zoo {
    
    private String name;
    private ArrayList<Animal> animals;

    public Zoo(String name, ArrayList<Animal> animals) {
        this.name = name;
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Zoo{" + "name=" + name + ", animals=" + animals + '}';
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    
    
}
