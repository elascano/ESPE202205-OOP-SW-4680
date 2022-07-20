package ec.edu.espe.stylesirelia.model;

import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Service extends BasicModel {

    private String name;
    private double price;
    private boolean pendingPayment;
    private boolean available;
    private ArrayList<Stylist> availableStylist;

    public Service() {
    }
    
    @Override
    public Document buildDocument() {
        Document document = new Document();

        document.append("price", this.price).
                append("name", this.name).
                append("pendingPayment", this.pendingPayment).
                append("availableStylist", this.availableStylist);

        return document;
    }

    public Service(String name, double price, boolean pendingPayment, boolean available, ArrayList<Stylist> availableStylist) {
        this.name = name;
        this.price = price;
        this.pendingPayment = pendingPayment;
        this.available = available;
        this.availableStylist = availableStylist;
    }

    @Override
    public String toString() {
        return "Service{" + "name=" + name + ", price=" + price + ", pendingPayment=" + pendingPayment + ", available=" + available + ", availableStylist=" + availableStylist + '}';
    }

    public String toStringData() {
        return name + "," + pendingPayment + "," + available + "," + availableStylist;
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
     * @return the pendingPayment
     */
    public boolean isPendingPayment() {
        return pendingPayment;
    }

    /**
     * @param pendingPayment the pendingPayment to set
     */
    public void setPendingPayment(boolean pendingPayment) {
        this.pendingPayment = pendingPayment;
    }

    /**
     * @return the available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * @return the availableStylist
     */
    public ArrayList<Stylist> getAvailableStylist() {
        return availableStylist;
    }

    /**
     * @param availableStylist the availableStylist to set
     */
    public void setAvailableStylist(ArrayList<Stylist> availableStylist) {
        this.availableStylist = availableStylist;
    }

}
