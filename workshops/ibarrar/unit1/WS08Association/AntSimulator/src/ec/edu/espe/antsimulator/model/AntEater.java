package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Ronny Ibarra, DCCO- ESPE, SyntaxError
 */
public class AntEater {

    private Cell position;
    private int antEaterCouner;
    private int runCounter;
    private int state;
    
    public void run(){
        System.out.println("AntEater is running");
    }

    public AntEater(Cell position, int antEaterCouner, int runCounter, int state) {
        this.position = position;
        this.antEaterCouner = antEaterCouner;
        this.runCounter = runCounter;
        this.state = state;
    }

    @Override
    public String toString() {
        return "AntEater{" + "position=" + getPosition() + ", antEaterCouner=" + getAntEaterCouner() + ", runCounter=" + getRunCounter() + ", state=" + getState() + '}';
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
     * @return the antEaterCouner
     */
    public int getAntEaterCouner() {
        return antEaterCouner;
    }

    /**
     * @param antEaterCouner the antEaterCouner to set
     */
    public void setAntEaterCouner(int antEaterCouner) {
        this.antEaterCouner = antEaterCouner;
    }

    /**
     * @return the runCounter
     */
    public int getRunCounter() {
        return runCounter;
    }

    /**
     * @param runCounter the runCounter to set
     */
    public void setRunCounter(int runCounter) {
        this.runCounter = runCounter;
    }

    /**
     * @return the state
     */
    public int getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
    }

    
}
