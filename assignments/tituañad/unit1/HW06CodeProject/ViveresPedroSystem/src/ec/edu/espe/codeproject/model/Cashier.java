package ec.edu.espe.codeproject.model;
/**
 * @author Daniela Tituaña, DCCO - ESPE,MyWayCode
 */
public class Cashier {
    private int id;
    private int CellPhone;
    private String name;
    private String adress; 
    private String email;
    private String user; 
    private String password;
    
    
    public Cashier(int id, int CellPhone, String name, String adress, String email, String user, String password) {
        this.id = id;
        this.CellPhone = CellPhone;
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.user = user;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Cashier{" + "id=" + id + ", CellPhone=" + CellPhone + ", name=" + name + ", adress=" + adress + ", email=" + email + ", user=" + user + ", password=" + password + '}';
    }
    
    public String toStringData() {
        return id + "," + CellPhone + "," + adress + "," + email + "," + user + "," + password + "/n";
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCellPhone() {
        return CellPhone;
    }

    public void setCellPhone(int CellPhone) {
        this.CellPhone = CellPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
}
