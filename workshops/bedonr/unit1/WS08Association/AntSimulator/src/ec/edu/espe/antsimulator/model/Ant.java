
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE,BettaCoders
 */
public class Ant {
    private Cell posistion;
    private int weight;
    
    public void run(){
        System.out.println("ant is running");
        
   }

    public Ant(Cell posistion, int weight) {
        this.posistion = posistion;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ant{" + "posistion=" + getPosistion() + ", weight=" + getWeight() + '}';
    }

    /**
     * @return the posistion
     */
    public Cell getPosistion() {
        return posistion;
    }

    /**
     * @param posistion the posistion to set
     */
    public void setPosistion(Cell posistion) {
        this.posistion = posistion;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
}
