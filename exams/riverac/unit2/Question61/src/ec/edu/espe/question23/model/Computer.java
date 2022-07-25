
package ec.edu.espe.question23.model;

import org.bson.Document;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Computer extends BasicModel{
    
    private int serialNumber;
    private String model;
    private String brand;
    private int ram;
    private int storage;
    private boolean status;
    private float price;

    public Computer(int serialNumber, String model, String brand, int ram, int storage, boolean status, float price) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.status = status;
        this.price = price;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public Document builDocument() {
        Document document = new Document("serialNumber", serialNumber).append("model", model)
                .append("brand", brand)
                .append("ram", ram)
                .append("storage", storage)
                .append("status", status)
                .append("price", price);
        
        return document;
    }
    
    
    
    
    
}
