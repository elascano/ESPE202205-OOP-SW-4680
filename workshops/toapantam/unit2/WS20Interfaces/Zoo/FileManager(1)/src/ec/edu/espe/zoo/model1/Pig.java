package ec.edu.espe.zoo.model1;
/**
 *
* @author Martín Toapanta, ESPE - DCCO, MyWayCode 
 */
public class Pig extends Mammal {

    
    @Override
    public void feed() {
        System.out.println("feeding a pig");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("adding Pig to Zoo -> " + zoo);
    }
    
}
