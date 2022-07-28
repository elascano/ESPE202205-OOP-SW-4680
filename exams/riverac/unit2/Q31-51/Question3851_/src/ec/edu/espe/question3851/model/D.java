package ec.edu.espe.question3851.model;

import java.util.ArrayList;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class D extends A {
    private ArrayList<F> f;
    
    private ArrayList<E> e;

    public D(ArrayList<F> f, ArrayList<E> e, ArrayList<A> a) {
        super(a);
        this.f = f;
        this.e = e;
    }
    
    

    public ArrayList<F> getF() {
        return f;
    }

    public void setF(ArrayList<F> f) {
        this.f = f;
    }

    public ArrayList<E> getE() {
        return e;
    }

    public void setE(ArrayList<E> e) {
        this.e = e;
    }
    
    
}
