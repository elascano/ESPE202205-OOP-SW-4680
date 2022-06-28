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
public class Ant {
    private Cell position;
    private int weight;
    
    
    public void run(){
        System.out.println("Ant is running");
    }

    public Ant(Cell position, int weight) {
        this.position = position;
        this.weight = weight;
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ant{" + "position=" + position + ", weight=" + weight + '}';
    }
    
}
