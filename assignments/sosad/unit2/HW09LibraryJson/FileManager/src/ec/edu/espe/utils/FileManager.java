
package ec.edu.espe.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.FileManager.model.Book;
import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class FileManager {
    
       public static void modifyBook(Book lib) {
        lib.setTitle(lib.getTitle());
        lib.setAuthor(lib.getAuthor());
        lib.setIbm(lib.getIbm());
    }
     public static void createJson(Book lib) {
        
         //Convetir el libro a JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString =  gson.toJson(lib);
        System.out.println(jsonString);
        
        //Guardar el json en fichero
        try(PrintWriter pw = new PrintWriter(new File("book.json"));){
            pw.write(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    
}
