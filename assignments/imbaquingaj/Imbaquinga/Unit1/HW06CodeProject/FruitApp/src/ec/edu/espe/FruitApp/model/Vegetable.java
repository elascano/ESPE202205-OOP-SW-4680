package ec.edu.espe.FruitApp.model;

/**
 *
 * @author Carlos Granda,Ronny Ibarra,Jose Imbaquinga, DCCO-ESPE, Syntax Error
 */
public class Vegetable {
    private String name;
    private String color;
    private int amount;
    private float weight;
    private float cost;

    public Vegetable() {
    }

    public Vegetable(String name, String color, int amount, float weight, float cost) {
        this.name = name;
        this.color = color;
        this.amount = amount;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Vegetable{" + "name=" + name + ", color=" + color + ", amount=" + amount + ", weight=" + weight + ", cost=" + cost + '}';
    }
    
}
