package ec.edu.espe.rectangleArea.model;

import java.util.Scanner;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Rectangle {

 private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
   
    public double getSideA() {
        return base;
    }

    public void setSideA(double sideA) {
        this.base = base;
    }

    public double getSideB() {
        return height;
    }

    public void setSideB(double sideB) {
        this.height = height;
    }

    public double calculateArea(){
        double area;
        
        area= (base*height);
        
        return area;
    }
    
}

