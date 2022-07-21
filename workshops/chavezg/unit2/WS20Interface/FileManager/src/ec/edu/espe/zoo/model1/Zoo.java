/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.zoo.model1;

import java.util.ArrayList;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
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
