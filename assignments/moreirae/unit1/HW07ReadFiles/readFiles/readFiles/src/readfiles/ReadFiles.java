package readfiles;
import java.io.*;
/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class ReadFiles {
    public static void main(String[] args) {
        String messagetoWrite = "Erick Moreira, 19, Portoviejo, 1315110534";
        String messageRead ="";
        
        try {
            FileWriter file = new FileWriter("Fichero a Escribir.txt");
            file.write(messagetoWrite);
            file.close();
            
        }catch (Exception ex) { ex.printStackTrace(); }
          
           try {
           FileReader reader = new FileReader("Fichero a Escribir.txt");
           BufferedReader BR = new BufferedReader(reader);
           messageRead = BR.readLine();
           
           
        }catch (Exception ex) { ex.printStackTrace(); }
        
        System.out.println("El mensaje guardado en el texto es: \n " + messageRead); 
        }
}
