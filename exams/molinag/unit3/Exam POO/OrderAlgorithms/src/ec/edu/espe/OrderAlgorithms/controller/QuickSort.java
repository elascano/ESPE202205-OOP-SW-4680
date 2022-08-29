package ec.edu.espe.OrderAlgorithms.controller;

import ec.edu.espe.OrderAlgorithms.model.SortApp;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class QuickSort extends SortingStrategy {

    public static int partition(int array[], int low, int high) {

        // choose the rightmost element as pivot
        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swapt the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i+ 1);
    }

    public static void sort(int array[], int low, int high, SortApp sortApp) {
        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, low, high);

            // recursive call on the left of pivot
            sort(array, low, pi - 1, sortApp);

            // recursive call on the right of pivot
            sort(array, pi + 1, high, sortApp);
        }
        sortApp.setOrderlyNumbers(array);
        sortApp.setSort("Quick");
        sortApp.setSize(sortApp.getUnarrangedNumbers().length);

    }
}
