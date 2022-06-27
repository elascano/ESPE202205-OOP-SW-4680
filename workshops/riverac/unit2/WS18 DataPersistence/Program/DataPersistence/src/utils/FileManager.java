package utils;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public abstract class FileManager extends Persistence{
        private String fileName;
        
        public boolean write(String)

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
