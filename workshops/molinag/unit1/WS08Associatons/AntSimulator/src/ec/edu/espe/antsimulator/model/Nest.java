package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
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
    private Cell getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    private void setPosition(Cell position) {
        this.position = position;
    }

    /**
     * @return the foods
     */
    private ArrayList<Food> getFoods() {
        return foods;
    }

    /**
     * @param foods the foods to set
     */
    private void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }
    
}
