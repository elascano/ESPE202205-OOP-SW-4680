package ec.edu.espe.areas.view;

import ec.edu.espe.areas.model.Triangle;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Areas {


    public static void main(String[] args) {
        
        Triangle triangle;
        double area;
        
        triangle = new Triangle(4, 4, 3);
        area= triangle.calculateArea();
        
        triangle = new Triangle(5, 5, 5);
        area= triangle.calculateArea();
        
        triangle = new Triangle(4.3, 3.4, 5.2);
        area= triangle.calculateArea();
        
        System.out.println("Area of a triangle:");
        System.out.println(area);
        
        
    }
    
    
}
