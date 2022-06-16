
package ec.edu.espe.utils;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class FileManager {
    
    public static String readFile(String fileName){
        //code to read from file
        String data  = "From" + fileName + "-> {\"name\":\"Carlos Granda\"}";
        return data;
    }
    
    public static int add(int addend1, int addend2){
        int sum;
        sum = addend1+addend2;
        return sum;
    }
}
