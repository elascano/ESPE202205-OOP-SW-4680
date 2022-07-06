
package ec.edu.espe.area.view;

import ec.edu.espe.area.model.Heptagon;
import java.util.Scanner;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Heptagon heptagon;
        
       int side;
       double apothem;
       double area;
       
       System.out.println("Calculation of the area of Heptagon");
         
         System.out.println("Put the value of the side: ");
         side = sc.nextInt();
         
         System.out.println("Put the value of the apothem: ");
         apothem = sc.nextDouble();
        
        
        
        heptagon = new Heptagon(apothem, side);
        
        area = heptagon.areaCalculator();
        System.out.println("The area total is: ");
        System.out.println(area);
        
    }
    
}
