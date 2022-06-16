package ec.edu.espe.university.view;

import ec.edu.espe.utils.FileManager;

/**
 *
 * @author Carlos Granda, DCCO- ESPE, SyntaxError
 */
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // FileManager fileManager = new FileManager();
        
        System.out.println("dat recoverd from file Manager->" + FileManager.readFile("students.json"));
        
        int addend1 = 5;
        int addend2 = 46;
        int sum;
        sum = FileManager.add(addend1, addend2);
        System.out.println("the addtion is ->" + sum);
        
    }
    
}
