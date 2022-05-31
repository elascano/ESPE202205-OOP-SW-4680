
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE,BettaCoders
 */
public class FoodPile {
    private int pileAmount;
    private Cell position;
    
    public Food yileFood(int amount){
        Food food;
        food = new Food(amount);
        return food;
    }

    public FoodPile(int pileAmount, Cell position) {
        this.pileAmount = pileAmount;
        this.position = position;
    }

    @Override
    public String toString() {
        return "FoodPile{" + "pileAmount=" + getPileAmount() + ", position=" + getPosition() + '}';
    }

    /**
     * @return the pileAmount
     */
    public int getPileAmount() {
        return pileAmount;
    }

    /**
     * @param pileAmount the pileAmount to set
     */
    public void setPileAmount(int pileAmount) {
        this.pileAmount = pileAmount;
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
    
}



