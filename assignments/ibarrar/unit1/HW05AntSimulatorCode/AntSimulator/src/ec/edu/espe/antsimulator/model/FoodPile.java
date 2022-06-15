package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Ronny Ibarra, DCCO- ESPE, SyntaxError
 */
public class FoodPile {
    
    private int pileAmount;
    private Cell position;

    public FoodPile(int pileAmount, Cell position) {
        this.pileAmount = pileAmount;
        this.position = position;
    }

    @Override
    public String toString() {
        return "FoodPile{" + "pileAmount=" + pileAmount + ", position=" + position + '}';
    }
    
    
    
    public Food yliedFood( ){
        return null;
        
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
