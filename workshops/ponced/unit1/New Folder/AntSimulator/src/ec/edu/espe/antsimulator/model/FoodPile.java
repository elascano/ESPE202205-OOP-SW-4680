
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, Dev's Developers
 */
public class FoodPile {
    int pileAmount;
    Cell position;
    
    public Food YileFood(int amount){
        Food food;
        food = new Food(amount);
        return food;
    
    }
    
}
