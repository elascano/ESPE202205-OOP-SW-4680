/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.areas.model;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class Square {
   private double base;
    private double height;

    public Square(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Square() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Square{");
        sb.append("base=").append(base);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
     public double CalculateArea(){
        double area;
        area= base*height;
        return area;
    }
}
