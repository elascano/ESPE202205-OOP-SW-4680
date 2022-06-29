package ec.edu.espe.model1;

import java.util.ArrayList;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
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
        return "Zoo{" + "name=" + getName() + ", animals=" + getAnimals() + '}';
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
     * @return the animals
     */
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    /**
     * @param animals the animals to set
     */
    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    
}
