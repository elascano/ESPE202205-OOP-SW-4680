
package ec.edu.espe.view;

import ec.edu.espe.utils.FileManager;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        System.out.println("dat recoverd from File Manager -> " + fileManager.readFile("students.json"));
        int addend1=5;
        int addend2=46;
        int sum;
        sum=fileManager.add(addend1,addend2);
        System.out.println("The addition is -->"+sum);
    }
    
}
