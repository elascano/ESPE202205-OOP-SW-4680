
package ec.edu.espe.exam.model;

import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class CellPhone {
    
    private int serialNumber;
    private String model;
    private String brand;
    private int ram;
    private int storage;
    private double price;

    public CellPhone(int serialNumber, String model, String brand, int ram, int storage, double price) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        
        this.price = price;
    }

    public CellPhone() {
    }
    
    public Document builDocument(){
        Document document = new Document("serialNumber", serialNumber).append("model", model)
                .append("brand", brand)
                .append("ram", ram)
                .append("storage", storage)
                
                .append("price", price);
        
        return document;
    }
    
    
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
    
}
