
package ec.edu.espe.areas.view;

import ec.edu.espe.areas.model.Rectangle;
import ec.edu.espe.areas.model.Triangle;
import java.util.Scanner;



/**
 *
 * @author Ronny Ibarra, DCCO- ESPE, Syntax Error
 */
public class Areas {

     public static void main(String[] args) {
         
         double sideA;
         double sideB;
         double sideC;
         double base;
         double height;
         double area;
         
         Scanner sc = new Scanner(System.in);
        
       Triangle triangle;
       triangle = new Triangle(5, 5, 3);
       area= triangle.CalculateArea();
       System.out.println("Enter sideA of Triangle");
       sideA = sc.nextDouble();
       
        System.out.println("Enter sideB of Triangle");
       sideB = sc.nextDouble();
       
       System.out.println("Enter sideC of Trangle");
       sideC = sc.nextDouble();
       
       System.out.println("The Area of triangle is");
       System.out.println(area);
       
       
       
       
       System.out.println("Enter base of Rectangle ");
       base =sc.nextDouble();
       System.out.println("Enter height of Rectangle");
       height =sc.nextDouble();
       Rectangle rectangle;
       rectangle = new Rectangle(base,height);
       area=rectangle.calculateArea();
         System.out.println(area);
        
        
   }

    
    
}
