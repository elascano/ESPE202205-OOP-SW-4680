
package espe.edu.ec.view;

import espe.edu.ec.model.Square;
import espe.edu.ec.model.Triangle;



/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Area {
    
     public static void main(String[] args) {
         Triangle triangle;
        double area;
        double areaSquare;
        
        //Triangle
        triangle = new Triangle(4, 4, 3);
        area= triangle.calculateArea();

        System.out.println("Area of a triangle:");
        System.out.println(area);
        
        //Square
        Square square;
        square = new Square(12, 12);
        areaSquare = square.CalculateArea();
         System.out.println("Area of Square: ");
         System.out.println(areaSquare);
         
         square = new Square(6, 3);
        areaSquare = square.CalculateArea();
         System.out.println("Area of Square: ");
         System.out.println(areaSquare);
         
         square = new Square(5.5F, 4.5F);
        areaSquare = square.CalculateArea();
         System.out.println("Area of Square: ");
         System.out.println(areaSquare);
         
        
        
        
        
        
    }

   
    
}
