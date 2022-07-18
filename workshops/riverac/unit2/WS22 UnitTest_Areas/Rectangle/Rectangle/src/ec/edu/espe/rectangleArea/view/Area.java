package ec.edu.espe.rectangleArea.view;

import ec.edu.espe.rectangleArea.model.Rectangle;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Area {
    
    public static void main(String[] args) {
        
        Rectangle rectangle;
        double area;
        
        rectangle = new Rectangle(8, 4);
        area= rectangle.calculateArea();
        
        rectangle = new Rectangle(9, 6);
        area= rectangle.calculateArea();
        
        rectangle = new Rectangle(8.3, 4.4);
        area= rectangle.calculateArea();
        
        System.out.println("Area of the rectangle:");
        System.out.println(area);
        
        
    } 
}
