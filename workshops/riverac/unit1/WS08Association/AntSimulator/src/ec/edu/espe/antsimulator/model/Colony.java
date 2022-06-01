package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Colony {
    
    private Nest nest;
    private ArrayList<Ant> ants;
    public void run(){
        System.out.println("The colony is running");
    }

    public Colony(Nest nest, ArrayList<Ant> ants) {
        this.nest = nest;
        this.ants = ants;
    }

    @Override
    public String toString() {
        return "Colony{" + "nest=" + nest + ", ants=" + ants + '}';
    }


    /**
     * @return the nest
     */
    public Nest getNest() {
        return nest;
    }

    /**
     * @param nest the nest to set
     */
    public void setNest(Nest nest) {
        this.nest = nest;
    }

    /**
     * @return the ants
     */
    public ArrayList<Ant> getAnts() {
        return ants;
    }

    /**
     * @param ants the ants to set
     */
    public void setAnts(ArrayList<Ant> ants) {
        this.ants = ants;
    }
    
    
}
