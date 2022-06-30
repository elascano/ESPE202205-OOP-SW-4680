/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.model;

import ec.edu.espe.controller.IAnimal;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
public class Cow implements IAnimal {
    
    @Override
    public void feed() {
        System.out.println("feeding a Cow");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("Adding cow to Zoo");
    }
    
}
