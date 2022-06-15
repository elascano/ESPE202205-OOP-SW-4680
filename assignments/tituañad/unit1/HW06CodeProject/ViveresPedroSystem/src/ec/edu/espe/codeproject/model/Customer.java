package ec.edu.espe.codeproject.model;
import java.util.ArrayList;
/**
 * @author Diana Sosa
 */
public class Customer {
    private int id;
    private int CellPhone;
    private String name;
    private String adress; 
    private String email;
    private ArrayList<Product> Product;
    
    public ArrayList<Product> buyProduct(){
        ArrayList<Product> product= new ArrayList<>();
        return product;
    }
    public ArrayList<Product> changeProduct(){
        ArrayList<Product> product= new ArrayList<>();
        return product;
    }
     public ArrayList<Product> searchProduct(){
        ArrayList<Product> product= new ArrayList<>();
        return product;
    }
    public Customer(int id, int CellPhone, String name, String adress, String email) {
        this.id = id;
        this.CellPhone = CellPhone;
        this.name = name;
        this.adress = adress;
        this.email = email;
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

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", CellPhone=" + CellPhone + ", name=" + name + ", adress=" + adress + ", email=" + email + '}';
    }
    
   
}
