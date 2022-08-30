package ec.edu.espe.OrderAlgorithms.controller;

import ec.edu.espe.OrderAlgorithms.model.SortApp;
import java.util.Arrays;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class InsertionSort extends SortingStrategy {
    
    @Override
    public int[] sort(SortApp sortApp) {
        
        int n = sortApp.getUnarrangedNumbers().length;
        int listOfNumbersAux[] = Arrays.copyOf(sortApp.getUnarrangedNumbers(), sortApp.getUnarrangedNumbers().length);
        for (int i = 1; i < n; ++i) {
            int key = listOfNumbersAux[i];
            int j = i - 1;
  
            /* Mueve los elementos de arr[0..i-1], que son
               mayores que key, a una posición por delante
               de su posición actual */
            while (j >= 0 && listOfNumbersAux[j] > key) {
                listOfNumbersAux[j + 1] = listOfNumbersAux[j];
                j = j - 1;
            }
            listOfNumbersAux[j + 1] = key;
        } 
        insertData(listOfNumbersAux, sortApp);
        return listOfNumbersAux;
    }
    
        private static void insertData(int listOfNumbersAux[], SortApp sortApp) {
        sortApp.setOrderlyNumbers(listOfNumbersAux);
        sortApp.setSort("InsertSort");
        sortApp.setSize(sortApp.getUnarrangedNumbers().length);
        sortApp.setUnarrangedNumbers(Arrays.copyOf(sortApp.getUnarrangedNumbers(), listOfNumbersAux.length));
    }
}
