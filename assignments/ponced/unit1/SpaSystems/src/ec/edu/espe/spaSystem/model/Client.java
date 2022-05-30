package ec.edu.espe.spaSystem.model;

/**
 *
 * @author Steven Pozo,Elkin Pabón,Ercik Moreira,David Ponce, DCCO-ESPE, DEES Developers
 */
public class Client {
    private String name;
    private String cellphone;
    private String ID;
    private int age;

    public Client() {
        
    }

    public Client(String name, String cellphone, String ID, int age) {
        this.name = name;
        this.cellphone = cellphone;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", cellphone=" + cellphone + ", ID=" + ID + ", age=" + age + '}';
    }

    //FUNCIONES:
    public void scheduleAppointment(){
        
    }
    public void cancelAppointment(){
        
    }
    public void deferAppointment(){
        
    }
    public void chooseService(){
        
    }
    
    public void rateService(){
    
    }
    
}
 
