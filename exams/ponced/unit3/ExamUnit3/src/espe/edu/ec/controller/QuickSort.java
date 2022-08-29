package espe.edu.ec.controller;

/**
 *
 * @author Diego Ponce
 */
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int[] number) {
        System.out.println("Quicsort is runnig");
        return QuickSort(number);
        
    }

    public int[] QuickSort(int number[]) {
        final int longNumber = number.length;
        InsertSort(number, 0, longNumber - 1);
        return number;
    }

    public static void InsertSort(int number[], int start, int fin) {
        if (start >= fin) {
            return;
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
        InsertSort(number, start, right - 1);
        InsertSort(number, right + 1, fin);
    }

}
