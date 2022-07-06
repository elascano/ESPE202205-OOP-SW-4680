package ec.edu.espe.zoo.model1;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class Cow extends Mammal {

    private int LitersPerDay;

    public Cow(int id, String description, String cage) {
        super(id, description, cage);
    }
    
  
    @Override
    public String toString() {
        return super.toString() + " --> Cow{" + "LitersPerDay=" + getLitersPerDay() + '}';
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
     * @return the LitersPerDay
     */
    public int getLitersPerDay() {
        return LitersPerDay;
    }

    /**
     * @param LitersPerDay the LitersPerDay to set
     */
    public void setLitersPerDay(int LitersPerDay) {
        this.LitersPerDay = LitersPerDay;
    }
    
}
