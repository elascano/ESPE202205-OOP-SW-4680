package ec.edu.espe.SortApp.model;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class SortingContext {
 
private SortingStrategy sortingStrategy;
public int[ ] sort( int data[ ] ) {
    int size = data.length;
    sortingStrategy = setSortStrategy(size);
    return sortingStrategy.sort(data);
}

public SortingStrategy setSortStrategy(int n) {
    if( n >0 && n < 30 )
    sortingStrategy = new BubbleSort();
        if( n >= 0 && n < 3 )
        sortingStrategy = new InsertionSort();
            if(  n >= 4 && n < 7 )
            sortingStrategy = new QuickSort();
                if(  n > 7)
                return sortingStrategy;
                    return null;  
    }
}
