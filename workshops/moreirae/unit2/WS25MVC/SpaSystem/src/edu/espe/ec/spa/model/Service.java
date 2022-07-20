
package edu.espe.ec.spa.model;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Service {
    private String type;
    private String date;
    private String duration;
    private float price;
    

    public Service(String type, String date, String duration, float price) {
        this.type = type;
        this.date = date;
        this.duration = duration;
        this.price = price;
        
    }

    
    
    /**
     * @return the type
     */
    
    
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
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
    
    
}
