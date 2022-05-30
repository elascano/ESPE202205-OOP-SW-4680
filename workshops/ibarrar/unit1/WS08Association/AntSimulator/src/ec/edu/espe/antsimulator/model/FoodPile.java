package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Ronny Ibarra, DCCO- ESPE, SyntaxError
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
