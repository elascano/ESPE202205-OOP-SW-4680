package ec.edu.espe.codeproject.model;

import javax.swing.JTextField;

/**
 *price
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class ProductPay {
   
    private int unit;
    private float price ;
    private float totalPay;
    private float totalPayIva;
    private String name;
    private int id;
    private String invoice;

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }
    

    
    public ProductPay( int unit, float price, float totalPay, float totalPayIva,String name, int id) {
   
        this.unit = unit;
        this.name = name;
        this.id = id;
        this.price = price;
        this.totalPay = totalPay;
        this.totalPayIva = totalPayIva;
    }

     public ProductPay() {
    }
     
  
    /**
 

    /**
     * @return the unit
     */
    public float getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(int unit) {
        this.unit = unit;
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
     * @return the totalPay
     */
    public float getTotalPay() {
        return totalPay;
    }

    /**
     * @param totalPay the totalPay to set
     */
    public void setTotalPay(float totalPay) {
        this.totalPay = totalPay;
    }

    /**
     * @return the totalPayIva
     */
    public float getTotalPayIva() {
        return totalPayIva;
    }

    /**
     * @param totalPayIva the totalPayIva to set
     */
    public void setTotalPayIva(float totalPayIva) {
        this.totalPayIva = totalPayIva;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void total(JTextField txtField){
       totalPay = (float) (price*unit); 
       //txtField.setText("$"+totalPay);
       totalPayIva = (float) (totalPay*0.12);
       txtField.setText("$"+totalPayIva);
   }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    
}
