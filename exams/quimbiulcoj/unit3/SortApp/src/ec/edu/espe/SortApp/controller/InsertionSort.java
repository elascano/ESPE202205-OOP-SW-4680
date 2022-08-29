package ec.edu.espe.SortApp.controller;

import ec.edu.espe.SortApp.model.Numbers;
import java.util.Arrays;

/**
 *
 * @author Carlos Rivera, Juan Quimbiulco DCCO-ESPE, CODEX++
 */
public class InsertionSort extends SortingStrategy {

    @Override
    public void sort(Numbers numbers) {
        
        int n = numbers.getUnsorted().length;
        int listOfNumbersAux[] = Arrays.copyOf(numbers.getUnsorted(), numbers.getUnsorted().length);
        for (int i = 1; i < n; ++i) {
            int key = listOfNumbersAux[i];
            int j = i - 1;
  
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && listOfNumbersAux[j] > key) {
                listOfNumbersAux[j + 1] = listOfNumbersAux[j];
                j = j - 1;
            }
            listOfNumbersAux[j + 1] = key;
        }
        
        numbers.setSorted(listOfNumbersAux);
        numbers.setAlgorithm("InsertSort");
        numbers.setSize(numbers.getUnsorted().length);
    }

}
