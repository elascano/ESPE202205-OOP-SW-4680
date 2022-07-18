
package ec.edu.espe.Spa.model;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Service {
    private String type;
    private String date;
    private String hourOfAttention;
    private float cost;

    public Service(String type, String date, String hourOfAttention, float cost) {
        this.type = type;
        this.date = date;
        this.hourOfAttention = hourOfAttention;
        this.cost = cost;
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
     * @return the hourOfAttention
     */
    public String getHourOfAttention() {
        return hourOfAttention;
    }

    /**
     * @param hourOfAttention the hourOfAttention to set
     */
    public void setHourOfAttention(String hourOfAttention) {
        this.hourOfAttention = hourOfAttention;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }
    
}
