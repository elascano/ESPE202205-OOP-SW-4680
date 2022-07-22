/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class Salmon extends Fish{

    public Salmon() {
    }
    
        @Override
    public void feed() {
        System.out.println("Fedding a salmon");    }

    @Override
    public void addtoZoo(Zoo zoo) {
        System.out.println("Adding to zoo");    }
    
}
