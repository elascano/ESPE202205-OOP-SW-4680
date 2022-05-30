package ec.edu.espe.spaSystem.model;

/**
 *
 * @author Steven Pozo,Elkin Pabón,Ercik Moreira,David Ponce, DCCO-ESPE, DEES Developers
 */
public class Treatment {
    private String type;
    private int cost;
    private String date;
    private String time;

    public Treatment() {
        
    }

    public Treatment(String type, int cost, String date, String time) {
        this.type = type;
        this.cost = cost;
        this.date = date;
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
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

    @Override
    public String toString() {
        return "Treatment{" + "type=" + type + ", cost=" + cost + ", date=" + date + ", time=" + time + '}';
    }
    
    //FUNCIONES:
    public void creatClientList(){
        
    }
    public void addAppointment(){
        
    }
    public void deleteappointment(){
        
    }
    public void billTreatmentType(){
        
    }
    public void giveDiscount(){
        
    }
    public void suggestProduct(){
        
    }
}
