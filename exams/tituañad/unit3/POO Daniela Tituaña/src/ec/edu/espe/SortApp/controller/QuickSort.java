package ec.edu.espe.SortApp.controller;

import ec.edu.espe.SortApp.model.NumbersBase;
/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class QuickSort extends SortingStrategy {

    
    public static int partition(int array[], int low, int high) {

        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            //if the client number is smaller than pivot in this case the system change with the  greater element pointed by i
            if (array[j] <= pivot) {
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

    public static void sort(int array[], int low, int high, NumbersBase listOfNumbers) {
        if (low < high) {

            int pi = partition(array, low, high);

            // recursive call on the left of pivot
            sort(array, low, pi - 1, listOfNumbers);

            // recursive call on the right of pivot
            sort(array, pi + 1, high, listOfNumbers);
        }
        listOfNumbers.setNumberOrdered(array);
        listOfNumbers.setSortAlgorithm("Quick Short");
        listOfNumbers.setSizeNumbers(listOfNumbers.getNumbersDisordered().length);

    }

}
