package ec.edu.espe.OrderAlgorithms.controller;

import ec.edu.espe.OrderAlgorithms.model.SortApp;
import java.util.Arrays;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class QuickSort extends SortingStrategy {

    @Override
    public int[] sort(SortApp sortApp) {
        int high;
        int numbers[] = Arrays.copyOf(sortApp.getUnarrangedNumbers(), sortApp.getUnarrangedNumbers().length);
        high = sortApp.getUnarrangedNumbers().length;

        return sort(numbers, 0, high - 1, sortApp);

    }

    private static void insertData(int array[], SortApp sortApp) {
        sortApp.setOrderlyNumbers(array);
        sortApp.setSort("Quick Short");
        sortApp.setSize(sortApp.getUnarrangedNumbers().length);
        sortApp.setUnarrangedNumbers(Arrays.copyOf(sortApp.getUnarrangedNumbers(), array.length));
    }

    public static int[] sort(int number[], int start, int fin, SortApp sortApp) {
        if (start >= fin) {
            return number;
        }
        int pivot = number[start];
        int left = start + 1;
        int right = fin;

        while (left <= right) {
            while (left <= fin && number[left] < pivot) {
                left++;
            }
            while (right > start && number[right] >= pivot) {
                right--;
            }
            if (left < right) {
                int temporary = number[left];
                number[left] = number[right];
                number[right] = temporary;
            }
        }
        if (right > start) {
            int temporary = number[start];
            number[start] = number[right];
            number[right] = temporary;
        }
        sort(number, start, right - 1, sortApp);
        sort(number, right + 1, fin, sortApp);
        insertData(number, sortApp);
        return number;
    }

}
