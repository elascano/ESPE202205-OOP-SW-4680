
package ec.edu.espe.areas.view;

import ec.edu.espe.areas.model.Triangle;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Area {

  
    public static void main(String[] args) {
       Triangle triangle;
        double area;
        triangle = new Triangle(4, 4, 3);
        area = triangle.computeArea();

        triangle = new Triangle(5, 5, 5);
        area = triangle.computeArea();
        
        triangle = new Triangle(4.3, 3.4, 5.2);
        area = triangle.computeArea();
        
        System.out.println("Area of Triangle: " + area);
    }
    
}
