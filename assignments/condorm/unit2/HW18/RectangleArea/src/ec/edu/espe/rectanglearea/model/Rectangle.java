/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.rectanglearea.model;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class Rectangle {
    
    private double base;
    private double altura;

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "base=" + base + ", altura=" + altura + '}';
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getHeight() {
        return altura;
    }

    /**
     * @param height the altura to set
     */
    public void setHeight(double height) {
        this.altura = height;
    }
       
    
    public double area(){
        double area;
       
        area=base*altura;
        return area;
    }
    
}
