
package ec.edu.espe.question.model;

import org.bson.Document;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MSI
 */
public class Shoe {
    
    private int id;
    private String brand;
    private float size;
    private String color;
    private String gender;

    public Shoe(int id, String brand, float size, String color, String gender, boolean status, float price) {
        this.id = id;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.gender = gender;
    }

    public Shoe(int i, String nike, int i0, String black, String men) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Document buildDocumentComputer(){
        Document document = new Document("id", id).append("brand", brand)
                .append("size", size)
                .append("color", color)
                .append("gender", gender);
      
        return document;
    }
    
    
    public int getId() {
        return id;
    }

    public void Id(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Document buildDocumentShoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
