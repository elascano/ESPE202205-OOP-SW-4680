package ec.edu.espe.SortApp.controller;

import ec.edu.espe.SortApp.model.Numbers;
import java.util.Arrays;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class InsertionSort extends SortingStrategy {

    @Override
    public void sort(Numbers listOfNumbers) {
        
        int n = listOfNumbers.getNumbersDisordered().length;
        int listOfNumbersAux[] = Arrays.copyOf(listOfNumbers.getNumbersDisordered(), listOfNumbers.getNumbersDisordered().length);
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
        
        listOfNumbers.setNumberOrdered(listOfNumbersAux);
        listOfNumbers.setSortAlgorithm("InsertSort");
        listOfNumbers.setSizeNumbers(listOfNumbers.getNumbersDisordered().length);
    }

}
