package ec.edu.espe.area.view;

import ec.edu.espe.area.models.Triangle;
import java.util.Scanner;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class Areas {

    public static void main(String[] args) {
        double area;
        double sideA;
        double sideB;
        double sideC;

        Triangle triangle;

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Side A");
        sideA = 23;
        System.out.println("Side B");
        sideB = 235;
        System.out.println("Side C");
        sideC = scanner.nextDouble();
        triangle = new Triangle(sideA, sideB, sideC);
        area = triangle.calculateArea();
        System.out.println(area);

    }

}
