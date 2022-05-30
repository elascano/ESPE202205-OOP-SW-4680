package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Ant {
    private Cell position;
    private int weight;
    
    
    public void run(){
        System.out.println("aunt is running");
    }

    public Ant(Cell position, int weight) {
        this.position = position;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ant{" + "position=" + getPosition() + ", weight=" + getWeight() + '}';
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
