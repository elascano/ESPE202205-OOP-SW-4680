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
public class Ant {
    private int weigth;
    private Cell position;
    
    public void run(){
        System.out.println("correidno");
    }

    public Ant(int weigth, Cell position) {
        this.weigth = weigth;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Ant{" + "weigth=" + getWeigth() + ", position=" + getPosition() + '}';
    }

    /**
     * @return the weigth
     */
    public int getWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    /**
     * @return the position
     */
    public Cell getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Cell position) {
        this.position = position;
    }
    
    
}
