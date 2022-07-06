
package ec.edu.espe.areas.view;

import ec.edu.espe.areas.model.Rectangle;
import java.util.Scanner;



/**
 *
 * @author Carlos Granda, DCCO- ESPE, Syntax Error
 */
public class Areas {

     public static void main(String[] args) {
         
         //double sideA;
         //double sideB;
         //double sideC;
         double base;
         double height;
         double area;
         
         Scanner sc = new Scanner(System.in);
        
//       Triangle triangle;
//       triangle = new Triangle(5, 5, 3);
//       area= triangle.CalculateArea();
//       System.out.println("Enter sideA");
//       sideA = sc.nextDouble();
//       
//        System.out.println("Enter sideB");
//       sideB = sc.nextDouble();
//       
//       System.out.println("Enter sideC");
//       sideC = sc.nextDouble();
//       
//       System.out.println("The Area of triangle is");
//       System.out.println(area);
       
       
       
       Rectangle rectangle;
       rectangle = new Rectangle(2, 5);
       area = rectangle.calculateArea();
       
       System.out.println("Area of a rectangle: ");
       System.out.println(area);
       //System.out.println("write the base ");
       //base =sc.nextDouble();
       //System.out.println("write the height");
       //height =sc.nextDouble();
       //Rectangle rectangle;
       //rectangle = new Rectangle(base,height);
       //area=rectangle.calculateArea();
       //System.out.println(area);

   }

    
    
}
