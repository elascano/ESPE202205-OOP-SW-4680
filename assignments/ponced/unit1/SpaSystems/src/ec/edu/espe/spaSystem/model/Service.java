package ec.edu.espe.spaSystem.model;

/**
 *
 * @author Steven Pozo,Elkin Pabón,Ercik Moreira,David Ponce, DCCO-ESPE, DEES Developers
 */
public class Service {
    private String type;
    private String date;
    private String time;
    private float cost;

    public Service() {
        
    }

    public Service(String type, String date, String time, float cost) {
        this.type = type;
        this.date = date;
        this.time = time;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Service{" + "type=" + type + ", date=" + date + ", time=" + time + ", cost=" + cost + '}';
    }
     
    //FUNCIONES:
    public void clientList(){
        
    }
    public void addAppointment(){
        
    }
    public void billServiceType(){
        
    }
    public void giveDiscount(){
        
    }
    
    
    
}
