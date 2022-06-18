package ec.edu.espe.utils.json;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class FileManager {
    
    public void abrirFichero() throws IOException{
    
       String json = "";
       
        try {
            BufferedReader br = new BufferedReader(new FileReader("Person.json"));
            
            String linea;
            while((linea = br.readLine()) != null){
                json += linea;
            }
            
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class);
        System.out.println(p);
}
    
}
