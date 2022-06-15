
package oddprimitive;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.msi
 */
public class OddPrimitive {

    public static void main(String[] args) {
       
        int numbers[];
        numbers=new int[5];
        
        for(int i=0;i<5;i++){
            numbers[i]=i+1;       
        }
        
        for(int i=0;i<5;i++){
            System.out.println(numbers[i]);
        }
    }
    
}
