
package ec.edu.espe.diagram.model;

import java.util.ArrayList;

/**
 *
 * @author Widinson Caiza,  DCCO- ESPE, BettaCoders
 */
public class C extends A{
    private ArrayList <E> es = new ArrayList <>();

    public C(ArrayList es) {
        this.es=es;
        
    }

    @Override
    public String toString() {
        return "C{"+super.toString() + "es=" + es + '}';
    }
    
    
    /**
     * @return the es
     */
    public ArrayList <E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList <E> es) {
        this.es = es;
    }
    
    
}
