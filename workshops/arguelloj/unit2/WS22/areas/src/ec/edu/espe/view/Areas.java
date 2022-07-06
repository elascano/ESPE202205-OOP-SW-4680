
package ec.edu.espe.view;

import ec.edu.espe.models.Triangle;

/**
 *
 * @author Joel Arguello, DCCO- ESPE, BettaCoders
 */
public class Areas {


    public static void main(String[] args) {
        
                
        Triangle triangle;
        double area;
        
        triangle = new Triangle(4, 4, 3);
        area = triangle.calculatedArea();
        
        System.out.println("Area of a triangle:");
        System.out.println(area);
        
    }
    
    
}
