
package ec.edu.espe.arrayObject.view;


/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numbers[];
        numbers=new int[3];
       
       for(int i=0;i<3;i++)
       {
           numbers[i]=i;
       }
      for(int j=0;j<3;j++)
       {
           System.out.println(numbers[j]);
       }
     
    }
    
}
