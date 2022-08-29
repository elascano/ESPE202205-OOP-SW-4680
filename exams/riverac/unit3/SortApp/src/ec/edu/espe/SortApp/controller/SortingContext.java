package ec.edu.espe.SortApp.controller;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class SortingContext {
 
    private SortingStrategy strategySort;

    public SortingContext(SortingStrategy strategySort) {
        this.strategySort = strategySort;
    }
      
    
    
    public int[] setSortTrategy(int number[]){
        return this.strategySort.sort(number);
    }
    

    
    public SortingStrategy getStrategySort() {
        return strategySort;
    }

    public void setStrategySort(SortingStrategy strategySort) {
        this.strategySort = strategySort;
    } 
}
