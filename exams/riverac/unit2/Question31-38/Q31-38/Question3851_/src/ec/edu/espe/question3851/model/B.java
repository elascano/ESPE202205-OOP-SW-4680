package ec.edu.espe.question3851.model;

import java.util.ArrayList;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class B extends A{
   private ArrayList<H> h;

    public B(ArrayList<H> h, ArrayList<A> a) {
        super(a);
        this.h = h;
    }

   
   
    public ArrayList<H> getH() {
        return h;
    }

    public void setH(ArrayList<H> h) {
        this.h = h;
    }
   
   
}
