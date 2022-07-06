
package ec.edu.espe.areas.view;

import ec.edu.espe.areas.model.Trapeze;
import ec.edu.espe.areas.model.Triangle;
import java.util.Scanner;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Area {

  
    public static void main(String[] args) {
//       Triangle triangle;
//        double area;
//        double sideA;
//        double sideB;
//        double sideC;
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Enter Side A : ");
//        sideA = keyboard.nextDouble();
//        System.out.println("Enter Side B : ");
//        sideB = keyboard.nextDouble();
//        System.out.println("Enter Side C : ");
//        sideC = keyboard.nextDouble();
//        triangle = new Triangle(sideA, sideB, sideC);
//        area = triangle.computeArea();
//        System.out.println("Area of Triangle: " + area);
        Trapeze trapeze;
        double area;
        double longBase;
        double shortBase;
        double altitude;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Long Base: ");
        longBase = keyboard.nextDouble();
        System.out.println("Enter Short Base : ");
        shortBase = keyboard.nextDouble();
        System.out.println("Enter Altitude : ");
        altitude = keyboard.nextDouble();
        trapeze = new Trapeze(longBase, shortBase,altitude);
        area = trapeze.computeArea();
        System.out.println("Area of Trapeze: "+area);
    }
    
}
