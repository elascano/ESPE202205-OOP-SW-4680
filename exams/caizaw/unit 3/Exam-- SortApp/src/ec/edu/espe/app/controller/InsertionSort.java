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
public class InsertionSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        int aux;
        int firstCont;
        int secondCont;
        for(firstCont = 1; firstCont<data.length;firstCont++){
                aux = data[firstCont];
                for(secondCont=firstCont-1;secondCont >=0 && data[secondCont]>aux;secondCont--){
                    data[secondCont+1]= data[secondCont];
                    data[secondCont]=aux;
                }
            }
        return null;
    }
    
}
