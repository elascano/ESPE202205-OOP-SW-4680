
package ec.edu.espe.diagram.model;

import java.util.ArrayList;

/**
 *
 * @author Widinson Caiza,  DCCO- ESPE, BettaCoders
 */
public class D {
    private ArrayList <F> fs = new ArrayList <>();
    private E esArray[] = new E[5];

    @Override
    public String toString() {
        return "D{" + "fs=" + getFs() + ", esArray=" + getEsArray() + '}';
    }

    public D(ArrayList fs) {
        this.fs=fs;
        
    }

    /**
     * @return the fs
     */
    public ArrayList <F> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList <F> fs) {
        this.fs = fs;
    }

    /**
     * @return the esArray
     */
    public E[] getEsArray() {
        return esArray;
    }

    /**
     * @param esArray the esArray to set
     */
    public void setEsArray(E[] esArray) {
        this.esArray = esArray;
    }

    

    

    
}
