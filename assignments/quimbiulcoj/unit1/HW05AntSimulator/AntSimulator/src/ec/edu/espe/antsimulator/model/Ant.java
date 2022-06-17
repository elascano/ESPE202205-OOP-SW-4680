 package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE CODEX++
 */
public class Ant {
    private Cell position;
    private int weigth;
    
    public void run(){
        System.out.println("ant is running");
    }

    public Ant(Cell position, int weigth) {
        this.position = position;
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Ant{" + "position=" + getPosition() + ", weigth=" + getWeigth() + '}';
    }

    /**
     * @return the position
     */
    private Cell getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    private void setPosition(Cell position) {
        this.position = position;
    }

    /**
     * @return the weigth
     */
    private int getWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    private void setWeigth(int weigth) {
        this.weigth = weigth;
    }
    
}
