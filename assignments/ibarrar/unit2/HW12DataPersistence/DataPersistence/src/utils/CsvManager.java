package utils;

import java.util.ArrayList;

/**
 *
 * @author Ronny Ibarra, DCCO- ESPE, SyntaxError
 */
public class CsvManager extends FileManager {

        @Override
    public boolean write(String fileName, String data) {
        return true;
       
    }

    @Override
    public ArrayList<String> read(String fileName) {
        return null;
        
    }

    @Override
    public boolean delet(String fileName, String criterion) {
        return false;
        
       
    }

    @Override
    public ArrayList<String> find(String fileName, String criterion) {
        
        return null;
        
    }

    @Override
    public boolean update(String fileName, String criterion, String neweData) {
        
        return false;
        
    }
}