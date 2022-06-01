/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.edu.espe.antisimulator.model;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class FoodPile {
    int pileAmount;
    Cell position;
    
    public Food yiledFood(int amount){
        Food food;
        food = new Food(amount);
        return food;
    }
}
