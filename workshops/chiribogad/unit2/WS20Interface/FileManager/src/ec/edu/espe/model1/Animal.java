package ec.edu.espe.model1;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public abstract class Animal {
    private int id;
    private String descrption;
    private String cage;

    public abstract void feed();
    public abstract void addtoZoo(Zoo zoo);

    public Animal(int id, String descrption, String cage) {
        this.id = id;
        this.descrption = descrption;
        this.cage = cage;
    }

    @Override
    public String toString() {
        return "\nAnimal{" + "id=" + id + ", descrption=" + descrption + ", cage=" + cage + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the descrption
     */
    public String getDescrption() {
        return descrption;
    }

    /**
     * @param descrption the descrption to set
     */
    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    /**
     * @return the cage
     */
    public String getCage() {
        return cage;
    }

    /**
     * @param cage the cage to set
     */
    public void setCage(String cage) {
        this.cage = cage;
    }
    
}
