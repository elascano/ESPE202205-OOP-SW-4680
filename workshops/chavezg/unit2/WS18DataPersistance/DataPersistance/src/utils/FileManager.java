
package utils;

import java.util.ArrayList;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public abstract class FileManager extends Persistance {
    
    private String FileName;
    
    public abstract boolean write(String fileName, String data);
    public abstract ArrayList<String> read(String fileName  );
    public abstract boolean delete(String fileName, String criterio);
    public abstract ArrayList<String> find(String fileName , String criterio);
    public abstract boolean update(String fileName, String criterio, String newData);

    public FileManager(String FileName) {
        this.FileName = FileName;
    }

    @Override
    public String toString() {
        return "FileManager{" + "FileName=" + FileName + '}';
    }
    

    /**
     * @return the FileName
     */
    public String getFileName() {
        return FileName;
    }

    /**
     * @param FileName the FileName to set
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }
    
}
