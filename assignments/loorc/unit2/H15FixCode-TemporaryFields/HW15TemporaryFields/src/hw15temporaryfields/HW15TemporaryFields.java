
package hw15temporaryfields;

import java.util.Scanner;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class HW15TemporaryFields {

   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        int addend1;
        int addend2;
        int addTotal;
        
        System.out.println("type addend1");
        addend1 = sc.nextInt();
        System.out.println("type addend2");
        addend2 = sc.nextInt();
        
        addTotal=addition(addend1,addend2);
        System.out.println("the addTotal=" + addTotal);
        

        //System.out.println("the addTotal="+addition(addend1,addend2));
    }           
    
    
        public static int addition(int addend1,int addend2){
        return addend1+addend2;
    }
    
    
//    public static int addition(int addend1, int addend2){
//        int addition=addend1+addend2;
//        return addition;
//      
//    }
   
    
}
