/*
 
 */
package ec.edu.espe.diagram.model;

import java.util.ArrayList;

/**
 *
 * @author Widinson Caiza,  DCCO- ESPE, BettaCoders
 */
public abstract class A {
    
    private ArrayList <A> as = new ArrayList<>();

    public A() {
    }

    

    @Override
    public String toString() {
        return "A{" + "as=" + as + '}';
    }
    
    
     /**
     * @return the as
     */
    public ArrayList <A> getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(ArrayList <A> as) {
        this.as = as;
    }
    
}
