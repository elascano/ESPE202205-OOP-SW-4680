/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.areas.model;
import java.util.*;
/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class Triangle {
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" + "a=" + getA() + ", b=" + getB() + ", c=" + getC() + '}';
    }

    public Triangle() {
    }
    
   

    /**
     * @return the a
     */
    public float getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public float getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(float c) {
        this.c = c;
    }
    
    public double calculateArea(float a, float b, float c)
    {
        double area=0;
        double semiPerimeter = 0;
        double number = 0;
        double number1 = 0;
        semiPerimeter = (a+b+c)/2;
        number = (semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c);
        number1=(semiPerimeter)*(number);
        area = Math.sqrt(number1);
        
        
        return area;
    }
    
}
