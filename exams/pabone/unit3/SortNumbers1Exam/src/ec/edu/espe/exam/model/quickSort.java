package ec.edu.espe.exam.model;

/**
 *
 * @author Elkin Pabon, Erick Moreira DCCO-ESPE, DEES Developers
 */

public class quickSort implements sortingStrategy{

    static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
            for (int i = begin; i < end; i++) {
                if (array[i] < array[pivot]) {
                int temp = array[counter];
                    array[counter] = array[i];
                    array[i] = temp;
                    counter++;
        }
    }
            
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;
        
    return counter;
}

public static void quickSort(int[] array, int begin, int end) {
    if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
}

    @Override
    public int[] sort(int[] data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    
    

   


