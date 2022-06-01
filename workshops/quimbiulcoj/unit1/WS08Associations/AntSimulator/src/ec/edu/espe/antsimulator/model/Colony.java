package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE CODEX++
 */
public class Colony {
    private Nest nest;
    ArrayList<Ant>ants;
    public void run(){
        System.out.println("The Colony is running");
    }
public Colony (Nest nest, ArrayList<Ant>ants){
    this.nest=nest;
    this.ants=ants;
}
    @Override
    public String toString() {
        return "Colony{" + "nest=" + getNest() + '}';
    }

    /**
     * @return the nest
     */
    private Nest getNest() {
        return nest;
    }

    /**
     * @param nest the nest to set
     */
    private void setNest(Nest nest) {
        this.nest = nest;
    }
    
}
