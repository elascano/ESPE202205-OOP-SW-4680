/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model1;

import java.util.ArrayList;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
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
