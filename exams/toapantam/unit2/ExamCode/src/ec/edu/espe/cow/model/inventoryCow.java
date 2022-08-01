
package ec.edu.espe.cow.model;

/**
 *
 * @author Martín Toapanta, ESPE DCCO, MyWayCode
 */
public class inventoryCow {
    private int code;
    private String type;
    private Float price;
    private String date;

    public inventoryCow(int code, String type, Float price, String date) {
        this.code = code;
        this.type = type;
        this.price = price;
        this.date = date;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
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
     * @return the price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Float price) {
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
    public void setDate(String date) {
        this.date = date;
    }
    
}
