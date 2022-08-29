package ec.edu.espe.exam.model;

/**
 *
 * @author Elkin Pabon, Erick Moreira DCCO-ESPE, DEES Developers
 */

public class insertionSort implements sortingStrategy{

    public static void insertionSort(int[] array) {
          
    for (int i = 1; i < array.length; i++) {
        int current = array[i];
        int j = i - 1;
        while(j >= 0 && current < array[j]) {
            array[j+1] = array[j];
            j--;
        }
        array[j+1] = current;
    }
}
    
    public int[] sort(int[] data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}
