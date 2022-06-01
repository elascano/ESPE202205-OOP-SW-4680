/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class PheromoneDrop {
    private int currenteLevel;
    
    public void run(){
        System.out.println("Runnig with PheromoneDrop");
    }

    public PheromoneDrop(int currenteLevel) {
        this.currenteLevel = currenteLevel;
    }

    /**
     * @return the currenteLevel
     */
    public int getCurrenteLevel() {
        return currenteLevel;
    }

    /**
     * @param currenteLevel the currenteLevel to set
     */
    public void setCurrenteLevel(int currenteLevel) {
        this.currenteLevel = currenteLevel;
    }
    
    
}
