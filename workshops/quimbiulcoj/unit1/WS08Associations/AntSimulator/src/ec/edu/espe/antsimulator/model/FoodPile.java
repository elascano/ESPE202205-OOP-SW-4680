/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE CODEX++
 */
public class FoodPile {

    int pileAmount;
    Cell position;

    public Food yileFood(int amount) {
        Food food;
        food = new Food(amount);
        return food;
    }
}
