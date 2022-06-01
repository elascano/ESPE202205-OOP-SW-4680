package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class FoodPile {
    
    int pileAmount;
    Cell position;

    public Food yielfFood(int amount){
        Food food;
        food = new Food(amount);
        return food;
    }
    
}
