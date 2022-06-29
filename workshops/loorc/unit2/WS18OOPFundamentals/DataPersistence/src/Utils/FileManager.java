
package Utils;

import java.util.ArrayList;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public abstract class FileManager extends Persistence{
    private String FileManager;

    
    public abstract boolean write(String fileName, String data);
    public abstract ArrayList<String> read(String fileName);
    public abstract boolean delete(String fileName, String criterion);
    public abstract ArrayList<String>find(String filename, String criterion);
    public abstract boolean update(String fileName, String criterion, String newData);
    
    /**
     * @return the FileManager
     */
    public String getFileManager() {
        return FileManager;
    }

    /**
     * @param FileManager the FileManager to set
     */
    public void setFileManager(String FileManager) {
        this.FileManager = FileManager;
    }
    
    
}
