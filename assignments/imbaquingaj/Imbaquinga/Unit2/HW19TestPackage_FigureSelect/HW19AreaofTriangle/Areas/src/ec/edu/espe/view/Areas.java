
package ec.edu.espe.view;

import ec.edu.espe.models.Triangle;
import java.util.Scanner;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class Areas {

    public static void main(String[] args) {
        
                
        Triangle triangle;
        Scanner entrada=new Scanner(System.in);
        double area;
        int sideA,sideB,sideC;
        System.out.println("Enter side A");
        sideA=entrada.nextInt();
        System.out.println("Enter side B");
        sideB=entrada.nextInt();
        System.out.println("Enter side C");
        sideC=entrada.nextInt();
        triangle = new Triangle(sideA,sideB,sideC);
        area = triangle.calculatedArea();
        System.out.println("Area of a triangle:");
        System.out.println(area);
        
    }

}
