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
public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
       
        int aux;
        boolean changes=false;
        while(true){
            changes=false;
            for(int i=1;i<data.length;i++){
                if(data[i]<data[i-1]){
                    aux = data[i];
                    data[i] = data[i-1];
                    data[i-1] = aux;
                    changes=true;
                }
            }
            if(changes==false)
                break;
        }
        return null;
    
    }
    
}
    
