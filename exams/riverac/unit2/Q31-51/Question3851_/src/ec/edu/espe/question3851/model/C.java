package ec.edu.espe.question3851.model;

import java.util.ArrayList;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class C extends A{
    private ArrayList<E> e;

    public C(ArrayList<E> e, ArrayList<A> a) {
        super(a);
        this.e = e;
    }
    
    

    public ArrayList<E> getE() {
        return e;
    }

    public void setE(ArrayList<E> e) {
        this.e = e;
    }
    
    
}
