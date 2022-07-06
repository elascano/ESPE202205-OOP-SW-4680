
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */

//Abstraction implemented using abstract classes
public abstract class Animal {
    private int id;
    private String description;
    private String cage;
    
    public abstract void feed();
    public abstract void addToZoo(Zoo zoo);

    public Animal(int id, String description, String cage) {
        this.id = id;
        this.description = description;
        this.cage = cage;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", description=" + description + ", cage=" + cage + '}';
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
