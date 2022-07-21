
package ec.edu.espe.forniture.model;

import org.bson.Document;

/**
 *
 * @author 
 */
public class Forniture extends BasicModel{
    
  private int numberForniture;
    private String model;
    private String color;
    private double price;
    private double zice;

    public Forniture(int numberForniture, String model, String color, double price, double zice) {
        this.numberForniture = numberForniture;
        this.model = model;
        this.color = color;
        this.price = price;
        this.zice = zice;
    }

    /**
     * @return the numberForniture
     */
    public int getNumberForniture() {
        return numberForniture;
    }

    /**
     * @param numberForniture the numberForniture to set
     */
    public void setNumberForniture(int numberForniture) {
        this.numberForniture = numberForniture;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the zice
     */
    public double getZice() {
        return zice;
    }

    /**
     * @param zice the zice to set
     */
    public void setZice(double zice) {
        this.zice = zice;
    }
    
    @Override
    public Document builDocument() {
        Document document = new Document("numberForniture", numberForniture).append("model", model)
                .append("numberForniture", numberForniture)
                .append("model", model)
                .append("color", color)
                .append("price", price)
                .append("zice", zice);
        
        return document;
    }
    
    
    
    
    
}
