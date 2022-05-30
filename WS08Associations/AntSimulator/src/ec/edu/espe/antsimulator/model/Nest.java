/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Nest {
    Cell postition;
    ArrayList<Food> foods;

    public Nest(Cell postition, ArrayList<Food> foods) {
        this.postition = postition;
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "Nest{" + "postition=" + postition + ", foods=" + foods + '}'+'\n';
    }
    
    
    
    
}
