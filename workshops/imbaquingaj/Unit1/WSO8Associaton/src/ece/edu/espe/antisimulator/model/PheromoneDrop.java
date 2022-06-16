/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.edu.espe.antisimulator.model;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class PheromoneDrop {
   int currentLevel;
    public void run(){
           System.out.println("Running with PheromoneDrop");
    }

    public PheromoneDrop() {
    }

    public PheromoneDrop(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

   
    
}
