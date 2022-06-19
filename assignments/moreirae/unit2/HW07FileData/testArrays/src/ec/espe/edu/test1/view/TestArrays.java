
package ec.espe.edu.test1.view;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class TestArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] numbers = new int [5];
       numbers[0] = 5;
       numbers[1] = 6;
       numbers[2] = 10;
       numbers[3] = 18;
       numbers[4] = 34;
       
       for(int i=0; i < 5; i++){
           System.out.println("The numbers are -> " + numbers[i]);
       }
        modifyArray(numbers);
        for(int i=0; i < 5; i++){
           System.out.println("The numbers are -> " + numbers[i]);
       }
    }
    
    public static void modifyArray (int numbers[] ){

           numbers[0] = numbers[0] + 5;
           numbers[1] = numbers[1] + 8;
           numbers[2] = numbers[2] + 9;
           numbers[3] = numbers[3] + 12;
           numbers[4] = numbers[4] + 15;
         
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
    
}
