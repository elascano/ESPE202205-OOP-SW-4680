
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, Dev's Developers
 */
public class Colony {
    private Nest nest;
    ArrayList<Ant> ants;
    public void run(){
        System.out.println("The colony is running");
    }
    public Colony (Nest nest){
        this.nest = nest;
    }
    @Override
    public String toString(){
        return "Colony{"
    }
}
