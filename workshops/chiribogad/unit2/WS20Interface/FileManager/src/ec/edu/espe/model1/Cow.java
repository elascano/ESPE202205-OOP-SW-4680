package ec.edu.espe.model1;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Cow extends Mammal{
    
    private int litersPerDay;

    public Cow(int id, String description, String cage) {
        super(id, description, cage);
    }
    
    @Override
    public String toString() {
        return super.toString() + " --> Cow{" + "LitersPerDay=" + getlitersPerDay() + '}';
    }
    
   @Override
    public void feed() {
        System.out.println("`Feeding a cow");
    }

    @Override
    public void addtoZoo(Zoo zoo) {
        System.out.println("addind this COW to the zoo " + zoo);
    }

    /**
     * @return the litersPerDay
     */
    public int getlitersPerDay() {
        return litersPerDay;
    }

    /**
     * @param litersPerDay the litersPerDay to set
     */
    public void setlitersPerDay(int litersPerDay) {
        this.litersPerDay = litersPerDay;
    }
    
}