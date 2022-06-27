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
public class AntEaters {
    Cell position;
    int anEaterCounter;
    int runCounter;
    int state;
    
    public void run(){
           System.out.println("AntEater is running")
                   ;
    }

    public AntEaters(Cell position, int anEaterCounter, int runCounter, int statec) {
        this.position = position;
        this.anEaterCounter = anEaterCounter;
        this.runCounter = runCounter;
        this.state = statec;
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public int getAnEaterCounter() {
        return anEaterCounter;
    }

    public void setAnEaterCounter(int anEaterCounter) {
        this.anEaterCounter = anEaterCounter;
    }

    public int getRunCounter() {
        return runCounter;
    }

    public void setRunCounter(int runCounter) {
        this.runCounter = runCounter;
    }

    public int getStatec() {
        return state;
    }

    public void setStatec(int statec) {
        this.state = statec;
    }

    @Override
    public String toString() {
        return "AntEaters{" + "position=" + position + ", anEaterCounter=" + anEaterCounter + ", runCounter=" + runCounter + ", statec=" + state + '}';
    }
    
}
