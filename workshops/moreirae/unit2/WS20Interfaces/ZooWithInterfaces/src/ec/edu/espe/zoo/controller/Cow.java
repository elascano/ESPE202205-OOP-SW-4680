
package ec.edu.espe.zoo.controller;

import ec.edu.espe.zoo.model.Zoo;
/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Cow implements IMammal{
    @Override
    public void feed(){
        System.out.println("Feeding a cow");
    }
    
     @Override
    public void addToZoo(Zoo zoo){
        System.out.println("Adding a cow to Zoo");
    }
}
