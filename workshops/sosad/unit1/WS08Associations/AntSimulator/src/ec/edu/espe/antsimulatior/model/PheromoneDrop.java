/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulatior.model;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class PheromoneDrop {
    private int currentLevel;
    public void run(){
        System.out.println("Running with PheromoneDrop"); 
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
