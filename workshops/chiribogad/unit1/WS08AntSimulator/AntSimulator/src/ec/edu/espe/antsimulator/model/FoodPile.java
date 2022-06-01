package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
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
