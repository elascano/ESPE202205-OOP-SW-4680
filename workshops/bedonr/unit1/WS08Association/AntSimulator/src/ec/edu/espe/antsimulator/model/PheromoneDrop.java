
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE,BettaCoders
 */
public class PheromoneDrop {
    private int currentLevel;

 public void run(){
     System.out.println("Running with PheromoneDrop");
 }

    public PheromoneDrop(int currentLevel) {
        this.currentLevel = currentLevel;
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