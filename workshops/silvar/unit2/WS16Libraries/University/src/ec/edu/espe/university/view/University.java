package ec.edu.espe.university.view;

import ec.edu.espe.utils.FileManager;
/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class University {
    public static void main(String[] args) {
        //FileManager fileManager = new FileManager();
        
        System.out.println("Data recovered from File Manager -> " + FileManager.readFile("students.json"));
        
        int addend1= 5;
        int addend2 = 46;
        int sum;
        sum = FileManager.add(addend1, addend2);
        System.out.println("the adition is ->" +sum);
    }
}
