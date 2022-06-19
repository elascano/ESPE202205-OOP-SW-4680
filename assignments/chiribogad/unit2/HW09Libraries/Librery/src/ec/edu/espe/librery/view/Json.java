package ec.edu.espe.librery.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danyc
 */
public class Json {
    public static void main(String[] args) {
        
        String json = "";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.json"));
            
            String line = "";
            while( (line = br.readLine()) != null){
                json += line;
            }
            
            br.close();
        
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Json.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Json.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(json);
        
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class);
        
    }
}
