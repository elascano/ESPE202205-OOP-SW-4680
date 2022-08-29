package ec.edu.espe.OrderAlgorithms.controller;

import ec.edu.espe.OrderAlgorithms.model.SortApp;
import java.util.Arrays;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class InsertionSort extends SortingStrategy {
    @Override
    public void sort(SortApp sortApp) {
        
        int n = sortApp.getUnarrangedNumbers().length;
        int listOfNumbersAux[] = Arrays.copyOf(sortApp.getUnarrangedNumbers(), sortApp.getUnarrangedNumbers().length);
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
        
        sortApp.setOrderlyNumbers(listOfNumbersAux);
        sortApp.setSort("InsertSort");
        sortApp.setSize(sortApp.getUnarrangedNumbers().length);
    }

}
