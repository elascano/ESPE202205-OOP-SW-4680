package ec.edu.espe.finalexam.controller;

import ec.edu.espe.finalexam.model.ListNumbers;
import java.util.Arrays;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class QuickSort extends SortingStrategy {

    public static int partition(int array[], int low, int high) {

        int pivot = array[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return (i + 1);
    }

    public static void sort(int[] numberArray, int low, int high, ListNumbers listOfNumbers) {
        if (low < high) {

            int pi = partition(numberArray, low, high);

            sort(numberArray, low, pi - 1, listOfNumbers);

            sort(numberArray, pi + 1, high, listOfNumbers);
        }
        listOfNumbers.setListOfNumberOrdered(numberArray);
        listOfNumbers.setSortAlgorithm("Quick");
        listOfNumbers.setSizeOfListOfNumbers(listOfNumbers.getListOfNumbersDisordered().length);

    }

}
