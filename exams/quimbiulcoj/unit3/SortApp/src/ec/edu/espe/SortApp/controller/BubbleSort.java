package ec.edu.espe.SortApp.controller;

import ec.edu.espe.SortApp.model.Numbers;
import java.util.Arrays;

/**
 *
 * @author Carlos Rivera, Juan Quimbiulco DCCO-ESPE, CODEX++
 */
public class BubbleSort extends SortingStrategy {
    
    
    @Override
    public void sort(Numbers numbers) {
        
        int listOfNumbersAux[];
        
        listOfNumbersAux = Arrays.copyOf(numbers.getUnsorted(), numbers.getUnsorted().length);
        
        for (int i = 0; i < numbers.getUnsorted().length - 1; ++i) {

            for (int j = 0; j < numbers.getUnsorted().length - i - 1; ++j) {

                if (listOfNumbersAux[j + 1] < listOfNumbersAux[j]) {

                    int swap = listOfNumbersAux[j];
                    listOfNumbersAux[j] = listOfNumbersAux[j + 1];
                    listOfNumbersAux[j + 1] = swap;
                    
                }
            }
        }
        
        numbers.setSorted(listOfNumbersAux);
        numbers.setAlgorithm("BubbleSort");
        numbers.setSize(numbers.getUnsorted().length);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
