/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class FoodPile {
    int PileAmout;
    Cell position ;
    
    
    public Food yiledFood(int amount){
    Food food;
    food = new Food(amount);
    return food;
    }
    
    
}
