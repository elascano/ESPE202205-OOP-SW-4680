/*
 * 
 */
package ec.edu.espe.JSONREADER.model;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class JSONREADER {

    public void JsonReader(String filename) throws FileNotFoundException, IOException{
    
        String json;
        String JsonData;
        BufferedReader JsonReader;
        Person JsonPerson;
        Gson gson;
        
        JsonReader = new BufferedReader(new FileReader(filename+".json"));
        JsonData="";
        json="";
        gson= new Gson();
        
        while((JsonData=JsonReader.readLine())!=null){
                json+=JsonData;
            }
            JsonReader.close();
        
        
        
        JsonPerson= gson.fromJson(json,Person.class);
        System.out.println(JsonPerson);
    }
        
        
    }
    

