package ec.edu.espe.calculator.model;

import java.util.Scanner;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, Dev's Developers
 */

class USTax {
    
    private float price;
    private float total;

    public USTax(float price, float total) {
        this.price = price;
        this.total = total;
    }
    
    private static USTax instance;
    private USTax(){
        }
    

    public static USTax getInstance() {
    if(instance == null)
    instance = new USTax();
    return instance;
    }

    
    public float salesTotal() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Tax Calculator");
        System.out.println("Insert the price of the product");
        price = keyboard.nextInt();
        total = price*12;
        System.out.println("The total is: " + total);
        return total;
        
        
       
        
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
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @param aInstance the instance to set
     */
    public static void setInstance(USTax aInstance) {
        instance = aInstance;
    }

}