
package ec.edu.espe.area.view;

import ec.edu.espe.area.model.Triangle;
import java.util.Scanner;




/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class Areas {
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
         Triangle triangle;
         double sideA;
         double sideB;
         double sideC;
         double area;
         
         
         
         System.out.println("Calculation of the area of triangle");
         
         System.out.println("Put the value of the first side: ");
         sideA = sc.nextDouble();
         
         System.out.println("Put the value of the second side: ");
         sideB = sc.nextDouble();
         
         System.out.println("Put the value of the third side: ");
         sideC = sc.nextDouble();
         
         triangle = new Triangle(sideA, sideB, sideC);
         
         area = triangle.areaCalcule();
         
         System.out.println("The area total is: ");
         System.out.println(area);
         
         
                  

    }
    
}
