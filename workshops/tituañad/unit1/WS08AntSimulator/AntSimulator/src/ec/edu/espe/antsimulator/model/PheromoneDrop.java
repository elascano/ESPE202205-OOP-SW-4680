package ec.edu.espe.antsimulator.model;

/**
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class PheromoneDrop {
    private int currentLevel;
    
    public void run(){
        System.out.println("Running with PheromoneDrop");
        
    }

    public PheromoneDrop(int carrentLevel) {
        this.currentLevel = carrentLevel;
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
