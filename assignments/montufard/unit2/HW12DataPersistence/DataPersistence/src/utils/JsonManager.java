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
 * @author David Montufar, DCCO-ESPE, GADC.msi
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
       
        return false;
  
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
