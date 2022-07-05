
package utils;

import java.util.ArrayList;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class CsvManager extends FileManager {

       @Override
    public boolean write(String fileName, String data) {
       //TODO write in a csv file
        return true;
       
    }

    @Override
    public ArrayList<String> read(String fileName) {
       
        return null;
       
    }

    @Override
    public boolean delete(String fileName, String criterion) {
       
        return false;
       
    }

    @Override
    public ArrayList<String> find(String fileName, String criterion) {
        
        return null;
        
    }

    @Override
    public boolean update(String fileName, String criterion, String newData) {
        
        return false;
        
    }

  
}

