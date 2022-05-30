package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class PheromoneDrop {
    private int currenteLevel;
    
    public void run(){
        System.out.println("Runnig with the pheromone drop");
    }

    public PheromoneDrop(int currenteLevel) {
        this.currenteLevel = currenteLevel;
    }

    /**
     * @return the currenteLevel
     */
    public int getCurrenteLevel() {
        return currenteLevel;
    }

    /**
     * @param currenteLevel the currenteLevel to set
     */
    public void setCurrenteLevel(int currenteLevel) {
        this.currenteLevel = currenteLevel;
    }
    
    
}
