
package utils;

import java.util.ArrayList;

/**
 *
 * @author Elkin Pabon, DCCO ESPE, DEES DEVELOPERS
 */
public abstract class FileManager extends Persistence{
  String fileName;  
  
  public abstract boolean write(String fileName, String data);
  public abstract ArrayList<String>read(String fileName);
  public abstract boolean delete(String fileName, String criterion);
  public abstract ArrayList<String>find(String fileName, String criterion);
  public abstract boolean update(String criterion, String newData);

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
  
}
