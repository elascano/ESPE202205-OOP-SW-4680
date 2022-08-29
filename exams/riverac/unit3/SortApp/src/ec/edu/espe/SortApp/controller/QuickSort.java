package ec.edu.espe.SortApp.controller;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class QuickSort extends SortingStrategy {

    @Override
    int[] sort(int[] number) {
        System.out.println("Quicsort is runnig");
        return QuickSort(number);
        
    }

    public int[] QuickSort(int number[]) {
        final int longNumber = number.length;
        sort1(number, 0, longNumber - 1);
        return number;
    }

    public static void sort1(int number[], int start, int fin) {
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
        sort1(number, start, right - 1);
        sort1(number, right + 1, fin);
    }

}

