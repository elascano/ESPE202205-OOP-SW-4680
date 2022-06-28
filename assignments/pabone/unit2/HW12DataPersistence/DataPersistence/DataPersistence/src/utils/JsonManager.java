package utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elkin Pabon, DCCO-ESPE, DEES Developers
 */
public class JsonManager extends FileManager {

    String pathJson;
    Gson gson = new Gson();
    
    
    ArrayList<String> dataJson = new ArrayList<>();
    
    @Override
    public void insert() {

    }
    
    @Override
    public boolean write(String fileName, String data) {

        
        
        pathJson = System.getProperty("user.dir") + "\\" + fileName;
        File file = new File(pathJson);
        

        try {
            FileWriter fileWriter;

            BufferedWriter bufferedWriter;

            file.exists();
            
           
            if (!file.exists()) {
                file.createNewFile();
                fileWriter = new FileWriter(pathJson);
            } else {
                fileWriter = new FileWriter(pathJson, true);
            }
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.append(data);

            bufferedWriter.close();
            dataJson.add(data);
        } catch (Exception e) {
            System.out.println(e);
        }

        return true;
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
        }
        
        
        return jsonData;
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
