
package ec.edu.espe.WS20.model;

import java.util.ArrayList;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.MSI
 */
public class Zoo {
    private String name;
    private ArrayList<Animal> animal;

    public Zoo(String name, ArrayList<Animal> animal) {
        this.name = name;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Zoo{" + "name=" + getName() + ", animal=" + getAnimal() + '}';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the animal
     */
    public ArrayList<Animal> getAnimal() {
        return animal;
    }

    /**
     * @param animal the animal to set
     */
    public void setAnimal(ArrayList<Animal> animal) {
        this.animal = animal;
    }
    
}
