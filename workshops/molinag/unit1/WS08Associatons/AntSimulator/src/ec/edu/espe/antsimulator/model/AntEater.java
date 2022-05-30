package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class AntEater {
    private Cell position;
    private int antEaterCounter;
    private int runCounter;
    private int state;
   
    public void run(){
        System.out.println("AntEater is running");
    }

    public AntEater(Cell position, int antEaterCounter, int runCounter, int state) {
        this.position = position;
        this.antEaterCounter = antEaterCounter;
        this.runCounter = runCounter;
        this.state = state;
    }

    @Override
    public String toString() {
        return "AntEater{" + "position=" + getPosition() + ", antEaterCounter=" + getAntEaterCounter() + ", runCounter=" + getRunCounter() + ", state=" + getState() + '}';
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
     * @return the antEaterCounter
     */
    private int getAntEaterCounter() {
        return antEaterCounter;
    }

    /**
     * @param antEaterCounter the antEaterCounter to set
     */
    private void setAntEaterCounter(int antEaterCounter) {
        this.antEaterCounter = antEaterCounter;
    }

    /**
     * @return the runCounter
     */
    private int getRunCounter() {
        return runCounter;
    }

    /**
     * @param runCounter the runCounter to set
     */
    private void setRunCounter(int runCounter) {
        this.runCounter = runCounter;
    }

    /**
     * @return the state
     */
    private int getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    private void setState(int state) {
        this.state = state;
    }
    
}
