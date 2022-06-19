package ec.edu.espe.utils;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE 
 */
public class FileManager {
    
    public String readFile(String fileName){
        //code to read from file
        String data = "From " + fileName + "-> {\"name\":\"Daniel\"}";
        return data;
    }
    
    public static int add(int addend1, int addend2){
        int sum;
        sum = addend1 + addend2;
        return sum;
    }
}


