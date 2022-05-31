/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
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
