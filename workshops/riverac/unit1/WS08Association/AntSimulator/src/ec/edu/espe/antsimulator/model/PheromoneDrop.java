package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class PheromoneDrop {
    
    private int currentLevel;
    
    public PheromoneDrop(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    @Override
    public String toString() {
        return "PheromoneDrop{" + "currentLevel=" + currentLevel + '}';
    }
    
    public void run(){
        System.out.println("Running with the PheromoneDrop");
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
