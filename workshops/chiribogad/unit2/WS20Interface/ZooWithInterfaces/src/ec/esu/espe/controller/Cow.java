/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.esu.espe.controller;

import ec.esu.espe.model.Zoo;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Cow implements IMammal{

    @Override
    public void feed() {
        System.out.println("feeding  Cow");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("Adding cow to Zoo");
    }
    
}
