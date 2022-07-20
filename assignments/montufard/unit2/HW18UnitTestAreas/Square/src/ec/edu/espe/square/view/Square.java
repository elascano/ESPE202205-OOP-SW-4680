
package ec.edu.espe.square.view;

import java.util.Scanner;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.msi
 */
public class Square {
    
    public static void main(String[] args) {
        int side, result;        
        Scanner obj = new Scanner(System.in);
 
        System.out.print("Enter side:\t");
        side = obj.nextInt();
 
        result = (side*side);
 
        System.out.println("The area of ​​the square is:\t"+result);
    }
       
}
