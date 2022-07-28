package ec.edu.espe.stylesirelia.model;

import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Product extends BasicModel {

    private String name;
    private float price;
    private String expiration;
    private int stock;

    @Override
    public Document buildDocument() {
        Document document = new Document();

        document.append("name", this.name).
                append("price", this.price).
                append("expiration", this.expiration).
                append("stock", this.stock);
        return document;
    }

    public Product(String name, float price, String expiration, int stock) {
        this.name = name;
        this.price = price;
        this.expiration = expiration;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", expiration=" + expiration + ", stock=" + stock + '}';
    }

    public String toStringData() {
        return name + "," + price + "," + expiration + "," + stock;
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
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the expiration
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * @param expiration the expiration to set
     */
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
