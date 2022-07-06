
package ec.edu.espe.areas.view;

import ec.edu.espe.areas.model.Square;
import ec.edu.espe.areas.model.Triangle;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Areas {


    public static void main(String[] args) {
        
        Triangle triangle;
        Square square;
        double area;
        
        triangle = new Triangle(4, 4, 3);
        area= triangle.calculateArea();        
        
        triangle = new Triangle(5, 5, 5);
        area= triangle.calculateArea();
        
        triangle = new Triangle(4.3, 3.4, 5.2);
        area= triangle.calculateArea();
        
        System.out.println("Area of a triangle:");
        System.out.println(area);
        
        square = new Square(4);
        area = square.getArea();
        
        square = new Square(7);
        area = square.getArea();
        
        square = new Square(5);
        area = square.getArea();
        
        System.out.println("Area of a Square:");
        System.out.println(area);
        
        
    }
    
    
}
