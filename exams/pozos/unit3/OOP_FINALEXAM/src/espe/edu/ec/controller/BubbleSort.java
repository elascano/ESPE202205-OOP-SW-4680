package espe.edu.ec.controller;

/**
 *
 * @author QUILUMBAQUIN JAIRO,STEVEN POZO DCC0-ESPE: CODEX++
 */
public class BubbleSort extends SortingStrategy{

    
    public int[] BubbleSortMehtod(int number[]){
    
        System.out.println("Bubble sort is running");
        
        int temporary;
        
        for(int i  = number.length - 1; i>0 ;i--){
            for(int j = 0; j<i ; j++){
                if(number[j] > number[j+1]){
                    temporary = number[j];
                    number[j] = number[j+1];
                    number[j+1]=temporary;
                }
            }
        }
    
        return number;
        
    }

    @Override
    int[] sort(int[] number) {
        return BubbleSortMehtod(number);        
    }

    
    
    
}
