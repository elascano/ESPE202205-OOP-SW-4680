package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Ronny Ibarra, DCCO- ESPE, SyntaxError
 */
public class Food {
    private int amount;

    public Food(int amount) {
        this.amount = amount;
    }

    
    @Override
    public String toString() {
        return "Food{" + "amount=" + amount + '}';
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
}
