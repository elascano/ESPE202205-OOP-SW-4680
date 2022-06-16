package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class PheromoneDrop {
   private int currentLevel;
   
   public void run(){
       System.out.println("Running with PheromoneDrop");
   }

    public PheromoneDrop(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    @Override
    public String toString() {
        return "PheromoneDrop{" + "currentLevel=" + getCurrentLevel() + '}';
    }

    /**
     * @return the currentLevel
     */
    private int getCurrentLevel() {
        return currentLevel;
    }

    /**
     * @param currentLevel the currentLevel to set
     */
    private void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }
   
}

