
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class PheromoneDrop {
    private int currentLevel;
    
    public void run(){
        System.out.println("Running with Pheromnerop");
        
    }

    public PheromoneDrop() {
    }

    /**
     * @return the currentLevel
     */
    public int getCurrentLevel() {
        return currentLevel;
    }

    /**
     * @param currentLevel the currentLevel to set
     */
    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }
    
    
}
