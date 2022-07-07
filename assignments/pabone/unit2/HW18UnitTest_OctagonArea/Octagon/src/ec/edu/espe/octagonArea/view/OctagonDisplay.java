package ec.edu.espe.octagonArea.view;

import java.util.Scanner;
import ec.edu.espe.octagonArea.model.Octagon;

/**
 *
 * @author Elkin Pabon, DCCO-ESPE, DEES Developers
 */

public class OctagonDisplay {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            double perimeter;
            double apothem;
            double area;
            
        Octagon octagon;
        
        System.out.println("-- OCTAGON AREA CALCULATOR --");
        System.out.println("Insert the perimeter:");
            perimeter = sc.nextDouble();
        System.out.println("Insert the apothem:");
            apothem = sc.nextDouble();
        
        octagon = new Octagon(perimeter,apothem);
        area = octagon.OctagonArea();
        
        System.out.println("- The area of the octagon is: " + area);
        
        System.out.println("\nFormula used: (perimeter*apothem)/2");
    }  
}
