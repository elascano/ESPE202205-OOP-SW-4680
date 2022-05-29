package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Ronny Ibarra, DCCO- ESPE, SyntaxError
 */
public class AntEater {

    private Cell position;
    private int antEaterCouner;
    private int runCounter;
    enum state{
        
    }

    public AntEater(Cell position, int antEaterCouner, int runCounter) {
        this.position = position;
        this.antEaterCouner = antEaterCouner;
        this.runCounter = runCounter;
    }

    @Override
    public String toString() {
        return "AntEater{" + "position=" + position + ", antEaterCouner=" + antEaterCouner + ", runCounter=" + runCounter + '}';
    }
    
    
    
    public void run(){
        
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
}
