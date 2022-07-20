
package espe.edu.ec.CoopLatinaMarco.model;

import org.bson.Document;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class TicketPassager extends BasicModel{
    
    private String route;
    private String bus;
    private String address;
    private float price;

    @Override
    public String toString() {
        return "ticket{" + "route=" + getRoute() + ", bus=" + getBus() + ", address=" + getAddress() + ", price=" + getPrice() + '}';
    }

    public TicketPassager(String route, String bus, String address, float price) {
        this.route = route;
        this.bus = bus;
        this.address = address;
        this.price = price;
    }

    /**
     * @return the route
     */
    public String getRoute() {
        return route;
    }

    /**
     * @param route the route to set
     */
    public void setRoute(String route) {
        this.route = route;
    }

    /**
     * @return the bus
     */
    public String getBus() {
        return bus;
    }

    /**
     * @param bus the bus to set
     */
    public void setBus(String bus) {
        this.bus = bus;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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

    @Override
    public Document buildDocument() {
        Document document = new Document();

        document.append("route", this.route).
                append("bus", this.bus).
                append("address", this.address).
                append("price", this.price);

        return document;
    }
    
    
}
