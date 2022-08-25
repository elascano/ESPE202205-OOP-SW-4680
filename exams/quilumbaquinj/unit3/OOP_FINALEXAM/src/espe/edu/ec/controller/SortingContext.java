/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.controller;

/**
 *
 * @author QUILUMBAQUIN JAIRO,STEVEN POZO DCC0-ESPE: CODEX++
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
