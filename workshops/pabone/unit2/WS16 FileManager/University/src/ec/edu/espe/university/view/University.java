package ec.edu.espe.university.view;

import ec.edu.espe.utils.FileManager;

/**
 *
 * @author Elkin Pabon, DCCO ESPE
 */
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //FileManager fileManager = new FileManager();
        
        System.out.println("Data recovered from File Manager -> " + FileManager.readFile(" students.json") );
            
                int addend1 = 5;
                int addend2 = 45;
                int sum;
                sum = FileManager.add(addend1, addend2);
        System.out.println("The addition is -> " + sum);
        
    }
    
}
