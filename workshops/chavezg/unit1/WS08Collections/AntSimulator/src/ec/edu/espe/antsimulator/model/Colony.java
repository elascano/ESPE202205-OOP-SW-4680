/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class Colony {
    
    private Nest nest;
    private ArrayList<Ant> ants;
    
    public void run(){
        System.out.println("The Colony is running");
    }

    public Colony(Nest nest, ArrayList<Ant> ants) {
        this.nest = nest;
        this.ants = ants;
    }

    @Override
    public String toString() {
        return "Colony{" + "nest=" + getNest() + ", ants=" + getAnts() + '}';
    }

    /**
     * @return the nest
     */
    public Nest getNest() {
        return nest;
    }

    /**
     * @param nest the nest to set
     */
    public void setNest(Nest nest) {
        this.nest = nest;
    }

    /**
     * @return the ants
     */
    public ArrayList<Ant> getAnts() {
        return ants;
    }

    /**
     * @param ants the ants to set
     */
    public void setAnts(ArrayList<Ant> ants) {
        this.ants = ants;
    }

  
    
    
}
