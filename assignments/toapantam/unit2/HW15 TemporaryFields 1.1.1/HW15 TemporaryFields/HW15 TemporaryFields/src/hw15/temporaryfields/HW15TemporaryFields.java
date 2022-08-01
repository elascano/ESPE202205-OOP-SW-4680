
package hw15.temporaryfields;

import java.util.Scanner;

/**
 *
 * @author Marín Toapanta, DCCO-ESPE, MyWayCode
 */
public class HW15TemporaryFields {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       int addend1;
       int addend2;
       int addTotal;
       
       System.out.println("type addend1:");
       addend1 = scanner.nextInt();
       System.out.println("type addend2:");
       addend2 = scanner.nextInt();
       
       addTotal=addition(addend1,addend2);
       System.out.println("the addTotal="+addTotal);
       
//       System.out.println("the addTotal="+addition(addend1,addend2));
        
        
        
    }
    
    
//    public static int addition(int addend1,int addend2){
//        return addend1+addend2;
//    }
    
    public static int addition(int addend1,int addend2){
        
        int addition=addend1+addend2;
        return addition;
    }
}
 


