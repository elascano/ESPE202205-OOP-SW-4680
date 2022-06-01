
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author MARTIN
 */
public class AntEater {
    Cell position;
    int antEaterCounter;
    int runCounter;
    int state;
    
    public void run(){
        System.out.printIn("AntEater is running");
    }

    public AntEater(Cell position, int antEaterCounter, int runCounter, int state) {
        this.position = position;
        this.antEaterCounter = antEaterCounter;
        this.runCounter = runCounter;
        this.state = state;
    }

    public Cell getPosition() {
        return position;
    }

    public int getAntEaterCounter() {
        return antEaterCounter;
    }

    public int getRunCounter() {
        return runCounter;
    }

    public int getState() {
        return state;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public void setAntEaterCounter(int antEaterCounter) {
        this.antEaterCounter = antEaterCounter;
    }

    public void setRunCounter(int runCounter) {
        this.runCounter = runCounter;
    }

    public void setState(int state) {
        this.state = state;
    }
    
}
