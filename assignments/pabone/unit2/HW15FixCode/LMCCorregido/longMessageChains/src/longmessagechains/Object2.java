package longmessagechains;

/**
 *
 * @author ronny
 */
public class Object2 {
 
    private int id;
    private String nane;

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
     * @return the nane
     */
    public String getNane() {
        return nane;
    }

    /**
     * @param nane the nane to set
     */
    public void setNane(String nane) {
        this.nane = nane;
    }

    public Object2(int id, String nane) {
        this.id = id;
        this.nane = nane;
    }

    @Override
    public String toString() {
        return "Object2{" + "id=" + id + ", nane=" + nane + '}';
    }
    
    
    
}
