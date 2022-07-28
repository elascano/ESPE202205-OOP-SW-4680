
package ec.edu.espe.areas.model;

import java.util.Scanner;

/**
 *
 * @author widinson caiaza, DCCO- ESPE, BettaCoders
 */
public class Triangle {
    
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(){
        Scanner reader = new Scanner(System.in);
        System.out.println("enter side A");
        sideA= reader.nextDouble();
        System.out.println("enter side B");
        sideB=reader.nextDouble();
        System.out.println("enter side C");
        sideC= reader.nextDouble();
    }
    
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    
    public double calculateArea(){
        double semiPerimeter;
        double area;
        
        semiPerimeter = (this.sideA+this.sideB+this.sideC)/2;
        
        area= Math.sqrt(semiPerimeter*(semiPerimeter-this.sideA)*(semiPerimeter-this.sideB)*(semiPerimeter-this.sideC));
        
        return area;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    
    
    
}
