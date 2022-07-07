
package ec.edu.espe.areas.view;

import ec.edu.espe.areas.model.Triangle;

/**
 *
 * @author Ronny Ibarra, DCCO- ESPE, Syntax Error
 */
public class Areas {


    public static void main(String[] args) {
        
        Triangle triangle;
        double area;
        
        triangle = new Triangle(4, 4, 3);
        area= triangle.CalculateArea();
        System.out.println(area);
        triangle = new Triangle(5, 5, 5);
        area= triangle.CalculateArea();
        System.out.println(area);
//        
        triangle = new Triangle(4.3, 3.4, 5.2);
        area= triangle.CalculateArea();
        System.out.println(area);
        
        
   }
    
    
}
