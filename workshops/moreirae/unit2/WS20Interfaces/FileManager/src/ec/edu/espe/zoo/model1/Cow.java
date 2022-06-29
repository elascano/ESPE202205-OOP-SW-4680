
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Cow extends Mammal{

    private int litersPerDay;

    public Cow(int id, String description, String cage) {
        super(id, description, cage);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Cow{" + "litersPerDay=" + getLitersPerDay() + '}';
    }
    
    
    
    @Override
    public void feed() {
        System.out.println("Feeding a cow");
    }

    @Override
    public void addtoZoo(Zoo zoo) {
        System.out.println("Adding a Cow to the zoo --> " + zoo);
    }

    /**
     * @return the litersPerDay
     */
    public int getLitersPerDay() {
        return litersPerDay;
    }

    /**
     * @param litersPerDay the litersPerDay to set
     */
    public void setLitersPerDay(int litersPerDay) {
        this.litersPerDay = litersPerDay;
    }
    
}
