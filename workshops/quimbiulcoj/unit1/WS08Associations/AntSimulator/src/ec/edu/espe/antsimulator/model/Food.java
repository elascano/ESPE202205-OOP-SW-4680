package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE CODEX++
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
