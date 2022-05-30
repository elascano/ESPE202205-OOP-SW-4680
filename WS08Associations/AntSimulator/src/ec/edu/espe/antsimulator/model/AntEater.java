package ec.edu.espe.antsimulator.model;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */

public class AntEater {  
    private Cell position;
    private int antEaterCounter;
    private int runCounter;
    private int state;
    
    public void run(){
        System.out.println("AntEater is runnig");
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
     * @return the antEaterCounter
     */
    public int getAntEaterCounter() {
        return antEaterCounter;
    }

    /**
     * @param antEaterCounter the antEaterCounter to set
     */
    public void setAntEaterCounter(int antEaterCounter) {
        this.antEaterCounter = antEaterCounter;
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

