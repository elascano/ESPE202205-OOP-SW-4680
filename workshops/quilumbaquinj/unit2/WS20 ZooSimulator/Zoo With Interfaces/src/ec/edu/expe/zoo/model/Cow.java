/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.expe.zoo.model;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Cow implements IAnimal{

    @Override
    public void feed() {
        System.out.println("feeding the Cow");
    }

    @Override
    public void addToZoo(IZoo zoo) {
        System.out.println("adding cow to zoo");
    }
    
}
