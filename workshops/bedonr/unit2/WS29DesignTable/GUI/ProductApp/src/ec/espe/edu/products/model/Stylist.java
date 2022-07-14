
package ec.espe.edu.products.model;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class Stylist {
    
   private String name;
   private String adress;
   private int number;
   private double payment;

    public Stylist(String name, String adress, int number, double payment) {
        this.name = name;
        this.adress = adress;
        this.number = number;
        this.payment = payment;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the payment
     */
    public double getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(double payment) {
        this.payment = payment;
    }
   
   
    
   
   
   
   
}
