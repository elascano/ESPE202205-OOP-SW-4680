package ec.edu.espe.utils;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class FileManager{
    public static String readFile(String fileName){
        //code to read from file
        String data ="From" +fileName+ "{\"name\":\"Raúl\"}";
        return data;
    }
    
    public static int add(int addend1, int addend2){
        int sum;
        sum = addend1+addend2;
        return sum;
    }
}
