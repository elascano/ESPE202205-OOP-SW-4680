package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class Food {
    int amount;

    public Food(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Food{" + "amount=" + amount + '}';
    }
    
}
