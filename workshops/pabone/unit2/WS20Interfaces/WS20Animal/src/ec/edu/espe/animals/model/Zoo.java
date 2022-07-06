package ec.edu.espe.animals.model;

import java.util.ArrayList;

/**
 *
 * @author Elkin Pabon, DCCO-ESPE, DEES Developers
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(ArrayList<Animal> animal) {
        this.animal = animal;
    }
    
}
