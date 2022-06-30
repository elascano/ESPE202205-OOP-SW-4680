package utils;

import java.util.ArrayList;

/**
 *
 * @author Ronny Ibarra, DCCO- ESPE, SyntaxError
 */
public abstract class FileManager extends Persistence {
   private String fileName;
   
   public abstract boolean write(String fileName, String data);
   public abstract ArrayList<String> read(String fileName);
   public abstract boolean delet(String fileName, String criterion);
   public abstract ArrayList<String> find(String fileName, String criterion);
   public abstract boolean update (String fileName, String criterion, String neweData);

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    
}
