
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class FoodPile {
    int pileAmount;
    Cell position;
    
    public Food yiledFood(int amount){
        Food food;
        food = new Food(amount);
        return food;
    }
}
