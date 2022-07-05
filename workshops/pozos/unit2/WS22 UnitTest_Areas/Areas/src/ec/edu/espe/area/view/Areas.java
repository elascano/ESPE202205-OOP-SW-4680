
package ec.edu.espe.area.view;

import ec.edu.espe.area.models.Triangle;

/**
 *
 * @author Steven Pozo, DCCO- ESPE, BettaCoders
 */
public class Areas {


    public static void main(String[] args) {
        double area;
        
        Triangle triangle;
        
        triangle = new Triangle(4, 4, 3);
        area=triangle.area();
        System.out.println(area);
        
        
        
        triangle = new Triangle(5, 5, 5);
        area=triangle.area();
        System.out.println(area);
        
        
        
        
        triangle = new Triangle(4.3, 4.4, 5.2);
        area=triangle.area();
        System.out.println(area);
        
        
    }
    
    
}
