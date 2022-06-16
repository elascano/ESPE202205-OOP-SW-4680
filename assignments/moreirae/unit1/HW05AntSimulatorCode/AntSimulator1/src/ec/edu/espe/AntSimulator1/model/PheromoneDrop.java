
package ec.edu.espe.AntSimulator1.model;

/**
 *
 * @author Erick Moreira, DCCO-ESPE, DEES Developers
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

