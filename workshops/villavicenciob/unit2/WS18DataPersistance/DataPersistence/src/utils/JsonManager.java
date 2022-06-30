
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class JsonManager extends FileManager{

    @Override
    public void insert() {
        
    }

    @Override
    public boolean write(String fileName, String data) {
        
        String pathJson;
        
        pathJson= String.getProperty("user.dir")+"\\" + fileName;
    
        File file = new File(pathJson);
        return false;
    }

    @Override
    public ArrayList<String> read(String fileName) {
        
        pathJson = System.getProperty("user.dir") + "\\" + fileName;
        
        ArrayList<String> jsonData = new ArrayList<>();    
        File file = new File(pathJson);
        
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null) {                
                jsonData.add(line);
            }
            System.out.println(bufferedReader.toString());
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return jsonData;
    }

    @Override
    public boolean delete(String fileName, String criterion) {
        retunr return false;
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
