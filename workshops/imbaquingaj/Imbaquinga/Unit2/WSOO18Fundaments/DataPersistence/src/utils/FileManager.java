package utils;

import java.util.ArrayList;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public abstract class FileManager extends Persistence {
    
    private String fileName;
    
    public abstract boolean write(String fileName, String data);
    public abstract ArrayList<String> read(String fileName);
    public abstract boolean delete(String fileName, String criterion);
    public abstract ArrayList<String> find(String filename, String criterion);
    public abstract boolean update(String fileName, String criterion, String newData);
    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
}
