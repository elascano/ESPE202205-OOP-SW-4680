/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.edu.espe.antisimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class Colony {
    private Nest nest;
    ArrayList<Ant> ants;
    public void run(){
        System.out.println("The colony is running");
    }

    public Colony(Nest nest,ArrayList<Ant> ants) {
        this.nest = nest;
    }

    public Nest getNest() {
        return nest;
    }

    public void setNest(Nest nest) {
        this.nest = nest;
    }

    public ArrayList<Ant> getAnts() {
        return ants;
    }

    public void setAnts(ArrayList<Ant> ants) {
        this.ants = ants;
    }

    @Override
    public String toString() {
        return "Colony{" + "nest=" + nest + ", ants=" + ants + '}';
    }

    
    
}
