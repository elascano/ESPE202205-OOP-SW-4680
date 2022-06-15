
package ec.edu.espe.stylesirelia.model;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
public class Commerce {
    private String name;
    private String direction;

    public Commerce(String name, String direction) {
        this.name = name;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Commerce{" + "name=" + name + ", direction=" + direction + '}';
    }
    
    
    
    public void addStylist(){
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }
    
}
