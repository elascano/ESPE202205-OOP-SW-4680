
package utils;

import java.util.ArrayList;

/**
 *
 * @author Luis Burbano, DCCO-ESPE, BettaCoders
 */
public abstract class FileManager extends Persistence {
    private String fileManager;

    public abstract boolean write(String fileName,String data);
    public abstract ArrayList<String> read(String fileName);
    public abstract boolean delete(String fileName,String criterion);
    public abstract ArrayList<String> find(String fileName, String criterion);
    public abstract boolean update(String fileName, String criterion,String newData);
    /**
     * @return the fileManager
     */
    public String getFileManager() {
        return fileManager;
    }

    /**
     * @param fileManager the fileManager to set
     */
    public void setFileManager(String fileManager) {
        this.fileManager = fileManager;
    }
    
}
