
package ec.edu.espe.question23.model;

import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class SmartWatchs {
    
   private String brand;
   private String design;
   private String material;
   private String price;

    public SmartWatchs(String brand, String design, String material, String price) {
        this.brand = brand;
        this.design = design;
        this.material = material;
        this.price = price;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the design
     */
    public String getDesign() {
        return design;
    }

    /**
     * @param design the design to set
     */
    public void setDesign(String design) {
        this.design = design;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SmartWatchs{" + "brand=" + brand + ", design=" + design + ", material=" + material + ", price=" + price + '}';
    }
   
    
    
    
    
}
