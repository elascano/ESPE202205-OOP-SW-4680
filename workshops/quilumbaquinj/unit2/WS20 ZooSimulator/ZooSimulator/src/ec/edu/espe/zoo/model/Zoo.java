package ec.edu.espe.zoo.model;

import java.util.ArrayList;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Zoo {
    
    
    private String name;
    private ArrayList<Animal> animals;

    public Zoo(String name, ArrayList<Animal> animals) {
        this.name = name;
        this.animals = animals;
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

    @Override
    public String toString() {
        return "Zoo{" + "animals=" + animals + ", name=" + name + '}';
    }
    
    
    
    
}
