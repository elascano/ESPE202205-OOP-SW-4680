/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.app.controller;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
public class QuickSort  implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        
        data = firstQuickSort(data);
           
            return null; 
    }
    
    public int [] firstQuickSort(int numbers[]){
        return secondQuickSort(numbers,0,numbers.length-1);
    }
    
    public int[] secondQuickSort(int numbers[],int left,int right){
        if(left>=right)
            return numbers;
        int l=left;
        int r=right;
        
        if(left!=right){
            int pivote;
            int aux;
            
            pivote = left;
            while(left!=right){
                while(numbers[right]>=numbers[pivote] && left<right)
                    right--;
                  while(numbers[left]<numbers[pivote] && left<right)
                      left++;
                  
            if(right!=left){
                aux=numbers[right];
                numbers[right]=numbers[left];
                numbers[left]=aux;
            }
            if(left==right){
                secondQuickSort(numbers,l,left-1);
                secondQuickSort(numbers, left+1,r);
                
            }
            }
            
                
        }
        else
            return numbers;
        return numbers;
    }
}
