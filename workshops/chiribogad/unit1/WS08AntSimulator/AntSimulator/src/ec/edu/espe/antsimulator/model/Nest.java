package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Nest {
    Cell position;
    ArrayList<Food> foods;

    public Nest(Cell position, ArrayList<Food> foods) {
        this.position = position;
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "Nest{" + "position=" + position + ", foods=" + foods + '}';
    }
    
    
}
