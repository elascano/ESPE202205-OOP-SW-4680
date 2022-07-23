
package ec.edu.espe.areas.model;

/**
 *
 * @author Carlos Granda, DCCO- ESPE, Syntax Error
 */
public class Square {
     
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    
    
    public double getArea(){
        double area;
        area = Math.pow(sideA,2);
        return area;
    }
    
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    
    
}
