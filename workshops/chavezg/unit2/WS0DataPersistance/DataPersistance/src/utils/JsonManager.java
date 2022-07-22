
package utils;

import java.util.ArrayList;
import com.google.gson.*;
import java.io.*;


/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class JsonManager extends FileManager {

  

    public JsonManager(String FileName) {
        super(FileName);
    }
    

  
      public boolean write2(String fileName, ArrayList data) throws IOException {
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
 
        Writer writer = new FileWriter(fileName+".json");
        writer.write(gson.toJson(data));
        writer.close();
        
         return false;
    }
    
 
    

    @Override
    public ArrayList<String> read(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String fileName, String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> find(String fileName, String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(String fileName, String criterio, String newData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean write(String fileName, String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
