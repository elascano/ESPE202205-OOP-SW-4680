package ec.edu.espe.utils;

/**
 *
 * @author Carlos Granda, DCCO- ESPE, SyntaxError
 */
public class FileManager {
    
    public static String readFile(String fileName){
        //code to read froim file
        String data = "From "+ fileName +"-> {\"name\":\"Carlos Granda\"}";
        return data;
    }
    public static int add(int addend1, int addend2){
        int sum;
        sum = addend1+addend2;
        return sum;
    }

}
