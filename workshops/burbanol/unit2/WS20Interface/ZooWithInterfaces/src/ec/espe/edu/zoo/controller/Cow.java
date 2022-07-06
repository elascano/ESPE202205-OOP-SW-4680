/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.zoo.controller;

import ec.espe.edu.zoo.model.Zoo;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Cow implements IMammal{

    @Override
    public void feed() {
        System.out.println("Feeding a cow");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("Adding cow to zoo");
        
    }
    
}
