package ec.edu.espe.university.view;

import ec.edu.espe.utils.FileManager;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class University {
    
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
    
        System.out.println("dat recoverd from File Manager -> " + fileManager.readFile("students.json"));
        
        int addend1 = 5;
        int addend2 = 46;
        int sum;
        sum = addend1 + addend2; 
        System.out.println("the addition is ->" +sum);
    
    
    }
}
