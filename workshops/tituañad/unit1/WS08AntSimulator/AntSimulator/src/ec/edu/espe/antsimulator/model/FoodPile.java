package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
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
