
package ec.edu.espe.computerstore.model;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class computers {
    String id;
    String typename;
    int ram;

    public computers(String id, String typename, int ram) {
        this.id = id;
        this.typename = typename;
        this.ram = ram;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    
    
    
}
