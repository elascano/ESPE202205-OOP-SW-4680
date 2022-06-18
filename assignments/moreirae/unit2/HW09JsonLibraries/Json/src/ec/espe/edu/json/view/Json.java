
package ec.espe.edu.json.view;

import ec.espe.edu.json.model.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Json {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an object with data
        Person person = new Person();
        person.setName("Erick");
        person.setId(1);
        person.setAge(19);
        person.setCourse("OOP");
        
        //From object to Json
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //gson.toJson(person);
        String jsonString = gson.toJson(person);
        System.out.println(jsonString);
        
        //Save json in file
        try {
           PrintWriter printWriter = new PrintWriter(new File("person.json"));
           //printWriter(jsonString);
           printWriter.close();

            
        } catch (Exception e) {
           e.printStackTrace();
        }
    }    
}
