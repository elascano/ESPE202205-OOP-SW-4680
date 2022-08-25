package ec.edu.espe.exam.model;

/**
 *
 * @author Diana Sosa
 */
public class SortingContext {
    private SortingStrategy sortingStrategy;
    
    public int[] sort(int data []){
        int size = data.length;
        sortingStrategy = setSortStrategy(size);
        return sortingStrategy.sort(data);
    }
    public SortingStrategy setSortStrategy(int size){
        if(size>0 && size<=3){
            sortingStrategy = new BubbleSort();
        }
        if(size>4 && size<=7){
            sortingStrategy = new InsertionSort();
        }
        if(size> 7){
            sortingStrategy = new QuickSort();
        }
        return sortingStrategy;
    }

    
}
