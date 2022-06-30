
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public abstract class Animal {
    
    private int id;
    private String description;
    private String cage;

    public Animal(int id, String description, String cage) {
        this.id = id;
        this.description = description;
        this.cage = cage;
    }

    @Override
    public String toString() {
        return "\nAnimal{" + "id=" + id + ", description=" + description + ", cage=" + cage + '}';
    }
    
    
    
    
    public abstract void feed();
    public abstract void addToZoo(Zoo zoo);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }
    
    
    
    
}
