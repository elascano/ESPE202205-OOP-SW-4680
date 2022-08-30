package ec.edu.espe.SortApp.controller;

import ec.edu.espe.SortApp.model.NumbersBase;
import java.util.Arrays;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class BubbleSort extends SortingStrategy {
    
    
    @Override
    public void sort(NumbersBase numbers) {
        
        int listOfNumbersAux[];
        
        listOfNumbersAux = Arrays.copyOf(numbers.getNumbersDisordered(), numbers.getNumbersDisordered().length);
        
        for (int i = 0; i < numbers.getNumbersDisordered().length - 1; ++i) {

            for (int j = 0; j < numbers.getNumbersDisordered().length - i - 1; ++j) {

                if (listOfNumbersAux[j + 1] < listOfNumbersAux[j]) {

                    int swap = listOfNumbersAux[j];
                    listOfNumbersAux[j] = listOfNumbersAux[j + 1];
                    listOfNumbersAux[j + 1] = swap;
                    
                }
            }
        }
        numbers.setNumberOrdered(listOfNumbersAux);
        numbers.setSortAlgorithm("BubbleSort");
        numbers.setSizeNumbers(numbers.getNumbersDisordered().length);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
