
package ec.edu.espe.finalexam.controller;

import ec.edu.espe.finalexam.model.ListNumbers;
import java.util.Arrays;

/**
 *
 * @author Ronny Ibarra, Ricardo Imbaquinga, DCCO- ESPE, Syntax Error
 */
public class BubbleSort extends SortingStrategy {
    
    
    @Override
    public void sort(ListNumbers listOfNumbers) {
        
        int listOfNumbersAux[];
        
        listOfNumbersAux = Arrays.copyOf(listOfNumbers.getListOfNumbersDisordered(), listOfNumbers.getListOfNumbersDisordered().length);
        
        for (int i = 0; i < listOfNumbers.getListOfNumbersDisordered().length - 1; ++i) {

            for (int j = 0; j < listOfNumbers.getListOfNumbersDisordered().length - i - 1; ++j) {

                if (listOfNumbersAux[j + 1] < listOfNumbersAux[j]) {

                    int swap = listOfNumbersAux[j];
                    listOfNumbersAux[j] = listOfNumbersAux[j + 1];
                    listOfNumbersAux[j + 1] = swap;
                    
                }
            }
        }
        
        listOfNumbers.setListOfNumberOrdered(listOfNumbersAux);
        listOfNumbers.setSortAlgorithm("BubbleSort");
        listOfNumbers.setSizeOfListOfNumbers(listOfNumbers.getListOfNumbersDisordered().length);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
