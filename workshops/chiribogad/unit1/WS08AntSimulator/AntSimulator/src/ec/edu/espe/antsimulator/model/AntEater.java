package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class AntEater {
    private Cell position;
    private int antEaterounter;
    private int runCounter;
    private int state;
    
    public void run(){
        System.out.println("AntEater is running");
    }

    public AntEater(Cell position, int antEaterounter, int runCounter, int state) {
        this.position = position;
        this.antEaterounter = antEaterounter;
        this.runCounter = runCounter;
        this.state = state;
    }

    @Override
    public String toString() {
        return "AntEater{" + "position=" + getPosition() + ", antEaterounter=" + getAntEaterounter() + ", runCounter=" + getRunCounter() + ", state=" + getState() + '}';
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
     * @return the antEaterounter
     */
    public int getAntEaterounter() {
        return antEaterounter;
    }

    /**
     * @param antEaterounter the antEaterounter to set
     */
    public void setAntEaterounter(int antEaterounter) {
        this.antEaterounter = antEaterounter;
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
