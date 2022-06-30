
package ec.edu.espe.zoo.controller;

import ec.edu.espe.zoo.model.Zoo;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Cow implements IMammal{

    @Override
    public void feed() {
        System.out.println("feeding a Cow");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("Adding cow to Zoo"); 
    }
    
}
