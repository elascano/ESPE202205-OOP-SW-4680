package ec.edu.espe.SortApp.controller;

import ec.edu.espe.SortApp.model.NumbersBase;
import java.util.Arrays;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class InsertionSort extends SortingStrategy {

    @Override
    public void sort(NumbersBase listOfNumbers) {
        
        int n = listOfNumbers.getNumbersDisordered().length;
        int listOfNumbersAux[] = Arrays.copyOf(listOfNumbers.getNumbersDisordered(), listOfNumbers.getNumbersDisordered().length);
        for (int i = 1; i < n; ++i) {
            int key = listOfNumbersAux[i];
            int j = i - 1;
 
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
