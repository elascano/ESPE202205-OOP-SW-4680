package ec.edu.espe.examvehicles.model;

import org.bson.Document;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class Vehicle {
    private String name;
    private String vehicleTypes; 
    private String color;
    private int mass;
    private int year; 

    public Vehicle(String name, String vehicleTypes, String color, int mass, int year) {
        this.name = name;
        this.vehicleTypes = vehicleTypes;
        this.color = color;
        this.mass = mass;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "name=" + name + ", vehicleTypes=" + vehicleTypes + ", color=" + color + ", mass=" + mass + ", year=" + year + '}';
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
     * @return the vehicleTypes
     */
    public String getVehicleTypes() {
        return vehicleTypes;
    }

    /**
     * @param vehicleTypes the vehicleTypes to set
     */
    public void setVehicleTypes(String vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the mass
     */
    public int getMass() {
        return mass;
    }

    /**
     * @param mass the mass to set
     */
    public void setMass(int mass) {
        this.mass = mass;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    public Document buildDocument() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
