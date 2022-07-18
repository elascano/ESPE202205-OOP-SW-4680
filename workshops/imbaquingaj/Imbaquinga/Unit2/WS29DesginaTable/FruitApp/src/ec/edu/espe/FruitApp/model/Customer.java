package ec.edu.espe.fruitApp.model;

/**
 *
 * @author Carlos Granda,Jose Imbaquinga, Roony Ibarra, DCCO-ESPE, Syntax Error
 */
public class Customer {
    
    private String email;
    private String fullName;
    private int cellPhone;
    private String type;
    private String discount;
    private String totalSale;

    public Customer(String email, String fullName, int cellPhone, String type, String discount, String totalSale) {
        this.email = email;
        this.fullName = fullName;
        this.cellPhone = cellPhone;
        this.type = type;
        this.discount = discount;
        this.totalSale = totalSale;
    }

  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(String totalSale) {
        this.totalSale = totalSale;
    }
    

    
    
}
