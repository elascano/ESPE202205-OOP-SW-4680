package ec.edu.espe.fruitApp.model;

/**
 *
 * @author Carlos Granda,Jose Imbaquinga, Roony Ibarra, DCCO-ESPE, Syntax Error
 */
public class Fruit {
    
    private String name;
    private String texture;
    private int quantity;
    private double weight;
    private float cost;

    public Fruit(String name, String texture, int quantity, double weight, float cost) {
        this.name = name;
        this.texture = texture;
        this.quantity = quantity;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    
    
}
