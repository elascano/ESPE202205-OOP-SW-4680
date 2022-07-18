package ec.edu.espe.store.model;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class ServicesDate {
    public String date;
    public int optionDate;
    public String services;
    public int price;

    public ServicesDate(String date, int optionDate, String services, int price) {
        this.date = date;
        this.optionDate = optionDate;
        this.services = services;
        this.price = price;
    }

    
    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    private void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the optionDate
     */
    public int getOptionDate() {
        return optionDate;
    }

    /**
     * @param optionDate the optionDate to set
     */
    private void setOptionDate(int optionDate) {
        this.optionDate = optionDate;
    }

    /**
     * @return the services
     */
    private String getServices() {
        return services;
    }

    /**
     * @param services the services to set
     */
    private void setServices(String services) {
        this.services = services;
    }

    /**
     * @return the price
     */
    private int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    private void setPrice(int price) {
        this.price = price;
    }
}
