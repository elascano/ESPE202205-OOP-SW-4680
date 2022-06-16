package ec.edu.espe.University.view;

import ec.edu.espe.utils.Filemanager;


/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.MSI
 */
public class University {

    private static Object FileManager;
    public static void main(String[] args) {
      //  FileManager fileManager=new FileManager();
        System.out.println("data recoverd from File Manager -->"+FileManager.readFile("Whats up bro"));
       
        int addend1=5;
        int addend2=4;
        int sum;
        sum=FileManager.add(addend1,addend2);
        System.out.println("the addition is -->"+sum);
        
    }
    
}
