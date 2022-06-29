
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Cow extends Mammal{
    
    private int litersPerDay;
    
    public Cow(int id, String description, String cage){
        super(id, description, cage);
    }

    @Override
    public String toString() {
        
        return super.toString() + "Cow{" + "litersPerDay=" + litersPerDay + '}';
    }
    

    @Override
    public void feed() {
        System.out.println("Fedding a Cow");
    }

    @Override
    public void addToZoo(Zoo zoo) {
        System.out.println("adding this animal to the zoor");
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

    
