/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulatior.model;

import java.util.ArrayList;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Nest {
    Cell position;
    ArrayList<Food> foods;

    @Override
    public String toString() {
        return "Nest{" + "position=" + position + ", foods=" + foods + '}';
    }
    
    

    public Nest(Cell position, ArrayList<Food> foods) {
        this.position = position;
        this.foods = foods;
    }
    
    
    
}
