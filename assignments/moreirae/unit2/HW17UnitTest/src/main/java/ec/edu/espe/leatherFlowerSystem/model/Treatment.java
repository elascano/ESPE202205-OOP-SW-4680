package ec.edu.espe.leatherFlowerSystem.model;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Treatment {
    private String type;
    private float cost;
    private String date;
    private String hourOfAttention;

    public Treatment(String type, float cost, String date, String hourOfAttention) {
        this.type = type;
        this.cost = cost;
        this.date = date;
        this.hourOfAttention = hourOfAttention;
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

    @Override
    public String toString() {
        return "Treatment{" + "type=" + type + ", cost=" + cost + ", date=" + date + ", hourOfAttention=" + hourOfAttention + '}';
    }
    
}
