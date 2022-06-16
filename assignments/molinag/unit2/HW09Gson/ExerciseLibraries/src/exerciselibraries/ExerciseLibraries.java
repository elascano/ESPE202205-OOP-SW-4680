package exerciselibraries;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class ExerciseLibraries {

        public static void main(String[] args) throws IOException {
        String json = "";
        
            try {
                BufferedReader br = new BufferedReader(new FileReader("personas.json"));
           
            String linea = "";
            while ((linea = br.readLine())!=null){
                json += linea; 
            }
            
            br.close();
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ExerciseLibraries.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println(json);
            
            Gson gson = new Gson();
            Persona p = gson.fromJson(json, Persona.class); 
            
            p.setEdad(45);
            
            System.out.println(p);
    }
}
