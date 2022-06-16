package ec.edu.espe.University.view;

import ec.edu.espe.utils.FileManager;



/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class University {
    public static void main(String[] args) {
      //  FileManager fileManager=new FileManager();
        System.out.println("data recoverd from File Manager -->"+FileManager.readFile("File Manager"));
        
        int addend1=10;
        int addend2=11;
        int sum;
        sum = FileManager.add(addend1,addend2);
        System.out.println("the addition is -->"+sum);
    }
}
