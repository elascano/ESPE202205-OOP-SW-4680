package ec.edu.espe.sort.model;

/**
 *
 * @author Chavez  DCCO-ESPE
 */
public class SortingContext {
    private SortingStrategy strategy;
    
    public int[] sort(int data []){
        int size = data.length;
        strategy = setSortStrategy(size);
        return strategy.sort(data);
    }
    public SortingStrategy setSortStrategy(int n){
        if(n>0 && n<=3){
            System.out.println("-> Apply Bubble Sort");
            strategy = new BubbleSort();
        }
        if(n>4 && n<=7){
            System.out.println("-> Apply Insertion Sort");
            strategy = new InsertionSort();
        }
        if(n> 7){
            System.out.println("-> Apply Quick Sort");
            strategy = new QuickSort();
        }
        return strategy;
    }

    
}
