package ec.edu.espe.utils;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class FileManager {
    
    public static String readFile(String fileName){
        //code to read from file
        String data = "From " +fileName + "--> {\"name\":\"Daniela\"}";
        return data;
    }
    
    public static int add(int addend1, int addend2){
        int suma;
        suma = addend1+addend2;
        return suma;
    }
}
