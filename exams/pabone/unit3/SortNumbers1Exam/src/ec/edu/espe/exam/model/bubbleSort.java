package ec.edu.espe.exam.model;

/**
 *
 * @author Elkin Pabon, Erick Moreira DCCO-ESPE, DEES Developers
 */

public class bubbleSort implements sortingStrategy{
    
    public int[] BubbleSortMehtod(int number[]){
            
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
    public int[] sort(int[] data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
}
