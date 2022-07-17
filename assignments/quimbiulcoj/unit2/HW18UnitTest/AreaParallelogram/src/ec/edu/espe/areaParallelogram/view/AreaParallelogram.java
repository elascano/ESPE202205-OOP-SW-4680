
package ec.edu.espe.areaParallelogram.view;
import ec.edu.espe.areaParallelogram.model.Parallelogram;
import java.util.Scanner;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, Codex++
 */
public class AreaParallelogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double height;
        double area;
        Parallelogram parallelogram;
        
        System.out.println("Enter the base of the Parallelogram:");
        base = sc.nextDouble();
        System.out.println("Enter the height of the Parallelogram:");
        height = sc.nextDouble();
        
        parallelogram = new Parallelogram(base,height);
        area = parallelogram.calculateAreaOfParallelogram();
        System.out.println("The area of the Parallelogram is: \n"+area);
    }
    
}
