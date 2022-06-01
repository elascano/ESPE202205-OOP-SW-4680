/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class PheromoneDrop {
    private int  currentLevel;
    
    public void run(){
        System.out.println("The Pheromone is running");
    }

    public PheromoneDrop(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    /**
     * @return the currentLevel
     */
    public int getCurrentLevel() {
        return currentLevel;
    }

    /**
     * @param currentLevel the currentLevel to set
     */
    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }
    
    
}
