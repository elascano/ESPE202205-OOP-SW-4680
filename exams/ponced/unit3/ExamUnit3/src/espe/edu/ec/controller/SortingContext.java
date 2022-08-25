/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.controller;

/**
 *
 * @author Diego Ponce
 */
public class SortingContext implements SortingStrategy{
    
    
    private SortingStrategy strategySort;

    
    
    public SortingStrategy setSortTrategy(int length){
        
        switch(length){
        
            case 0,1,2,3->strategySort= new BubbleSort();
            case 4,5,6,7->strategySort= new InsertionSort();
            default->strategySort= new QuickSort();
            
        }
        
        return strategySort;
    }

    @Override
    public int[] sort(int[] number) {
        
        int size=number.length;
        strategySort=setSortTrategy(size);
        return strategySort.sort(number);
    }
    
    
    

    
    
}
