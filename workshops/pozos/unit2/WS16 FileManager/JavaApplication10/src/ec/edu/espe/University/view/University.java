package ec.edu.espe.University.view;

import ec.edu.espe.utils.FileManager;



/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class University {
    public static void main(String[] args) {
      //  FileManager fileManager=new FileManager();
        System.out.println("data recoverd from File Manager -->"+FileManager.readFile("que mas mi pes"));
        
        int addend1=5;
        int addend2=4;
        int sum;
        sum=FileManager.add(addend1,addend2);
        System.out.println("the addition is -->"+sum);
    }
}
