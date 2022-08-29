package ec.edu.espe.stylesirelia.model;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Service {

    private String name;
    private double price;
    private boolean available;
    private String availableStylist;

    public Service() {
    }

    public Service(String name, double price, boolean available, String availableStylist) {
        this.name = name;
        this.price = price;
        this.available = available;
        this.availableStylist = availableStylist;
    }

    @Override
    public String toString() {
        return "Service{" + "name=" + name + ", price=" + price + ", available=" + available + ", availableStylist=" + availableStylist + '}';
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
    public String getAvailableStylist() {
        return availableStylist;
    }

    /**
     * @param availableStylist the availableStylist to set
     */
    public void setAvailableStylist(String availableStylist) {
        this.availableStylist = availableStylist;
    }

}
