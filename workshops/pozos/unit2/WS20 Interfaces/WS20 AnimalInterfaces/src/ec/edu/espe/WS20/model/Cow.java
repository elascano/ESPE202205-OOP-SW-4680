
package ec.edu.espe.WS20.model;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Cow extends Mammal {
    private int literPerDay;

    public Cow(int id, String description, String cage) {
        super(id, description, cage);
    }

    @Override
    public String toString() {
        return super.toString()+ "Cow{" + "literPerDay=" + literPerDay + '}';
    }
    
    @Override
    public void feed() {
        System.out.println("feeding cow");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("addind this cow to the zoo"+zoo);
    }

    /**
     * @return the literPerDay
     */
    public int getLiterPerDay() {
        return literPerDay;
    }

    /**
     * @param literPerDay the literPerDay to set
     */
    public void setLiterPerDay(int literPerDay) {
        this.literPerDay = literPerDay;
    }
}
