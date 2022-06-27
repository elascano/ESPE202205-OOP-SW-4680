
package ec.edu.espe.university.view;

import ec.edu.espe.utils.FileManager;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class University {
   
   public static void main(String[] args){
       FileManager filemanager = new FileManager();
       
           System.out.println("dat recoverd from File Manager -> " + filemanager.readFile("students.json"));
           
           int addend1 = 5;
           int addend2 = 46;
           int sum;
           sum = filemanager.add(addend1,addend2);
           System.out.println("the addition is -> " + sum);
   }  
}
