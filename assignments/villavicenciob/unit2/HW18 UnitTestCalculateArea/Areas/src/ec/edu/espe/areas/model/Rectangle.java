/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.areas.model;
import java.util.Scanner;
/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class Rectangle {
    private double base;
    private double height;

    public Rectangle(){
        Scanner reader = new Scanner(System.in);
        System.out.println("enter base");
        base= reader.nextDouble();
        System.out.println("enter the height");
        height=reader.nextDouble();
    }
    
    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


//    public void leerdatos(){
//        Scanner reader = new Scanner(System.in);
//        System.out.println("ingrese la base");
//        base= reader.nextDouble();
//        System.out.println("ingrese la altura");
//        height=reader.nextDouble();
//    }
    
     public double calculateAreaRc(){
        
        double Perimeter;
        double areaR;
        
        Perimeter = 2*base+2*height;
        
        areaR= base*height;
        
        return areaR;
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
        return "Rectangule{" + "base=" + getBase() + ", height=" + getHeight() + '}';
    }
    
}
