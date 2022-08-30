package ec.edu.espe.codeproject.model;

import org.bson.Document;

/**
 *

 * @author Martin Toapanta, DCCO-ESPE, MyWayCode

*/
public class Inventory extends Abstract {
    private String product;
    private int code;
    private String type;
    private int amount;
    private float price;
    private int discount;
    private String date;
    private String status;

    public Inventory(String product, int code, String type, int amount, float price, int discount, String date, String status) {
        this.product = product;
        this.code = code;
        this.type = type;
        this.amount = amount;
        this.price = price;
        this.discount = discount;
        this.date = date;
        this.status = status;
    }

    public Inventory() {
    }

   
    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
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
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
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

    /**
     * @return the discount
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(int discount) {
        this.discount = discount;
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Inventory{" + "product=" + product + ", code=" + code + ", type=" + type + ", amount=" + amount + ", price=" + price + ", discount=" + discount + ", date=" + date + ", status=" + status + '}';
    }

    @Override
    public Document buildDocument() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
   