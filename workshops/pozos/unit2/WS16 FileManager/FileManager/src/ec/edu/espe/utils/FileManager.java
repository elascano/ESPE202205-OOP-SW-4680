
package ec.edu.espe.utils;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class FileManager {
    public static String readFile(String fileName){
        // code to read from file
        
        String data ="From"+fileName+"-->{\"name\":\"Steven\"}";
        return data;
    }
    public static int add(int addend1, int addend2){
        int sum;
        sum = addend1+addend2;
        return sum;
    }
    
}
