package ec.edu.espe.zoo.model1;
/**
 *
* @author Martín Toapanta, ESPE - DCCO, MyWayCode 
 */
public class Cow extends Mammal {
    
    private int litersPerDay;

    public Cow(int litersPerDay, int id, String description, String cage) {
        super(id, description, cage);
        this.litersPerDay = litersPerDay;
    }

    public Cow(int litersPerDay) {
        this.litersPerDay = litersPerDay;
    }

    @Override
    public String toString() {
        return "Cow{" + "litersPerDay=" + getLitersPerDay() + '}';
    }

    
    @Override
    public void feed() {
        System.out.println("Feeding a cow");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("Addind this cow to the zoo " + zoo);
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
