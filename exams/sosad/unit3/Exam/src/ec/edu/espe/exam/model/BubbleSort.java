package ec.edu.espe.exam.model;

/**
 *
 * @author Diana Sosa
 */
public class BubbleSort implements SortingStrategy {
    public int[] sort(int data[]) {
        int number = data.length;
        int temp = 0;
        for (int count = 0; count < number; count++) {
            for (int j = 1; j < (number - count); j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }
}
