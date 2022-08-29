package ec.edu.espe.exam.controller;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public interface SortingStrategy {

    public int[] sort(int data[]);
    public int[] sort(int data[],int low, int high);
    
}
