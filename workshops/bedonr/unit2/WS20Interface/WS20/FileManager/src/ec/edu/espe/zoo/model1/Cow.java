
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class Cow extends Mammal{

    private int litersPerday;

    public Cow(int litersPerday, int id, String description, String cage) {
        super(id, description, cage);
        this.litersPerday = litersPerday;
    }
    
    

  

    @Override
    public String toString() {
        return super.toString()+ "Cow{" + "litersPerday=" + getLitersPerday() + '}';
    }
    
    @Override
    public void feed() {
        System.out.println("Feeding a cow");    
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("addind this COW to the zoo" + zoo);


    }

    /**
     * @return the litersPerday
     */
    public int getLitersPerday() {
        return litersPerday;
    }

    /**
     * @param litersPerday the litersPerday to set
     */
    public void setLitersPerday(int litersPerday) {
        this.litersPerday = litersPerday;
    }
    
}
