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
public class Nest {
    
    private Cell position;
    private ArrayList<Food> foods;

    public Nest(Cell position, ArrayList<Food> foods) {
        this.position = position;
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "Nest{" + "position=" + getPosition() + ", foods=" + getFoods() + '}';
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

    /**
     * @return the foods
     */
    public ArrayList<Food> getFoods() {
        return foods;
    }

    /**
     * @param foods the foods to set
     */
    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }
    
    
}
