package ec.edu.espe.store.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Bread {
    private int id;
    private String name;
    private String type;
    private int units;
    private float price;

    public Bread(int id, String name, String type, int units, float price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.units = units;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
