
package Utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import static sun.text.normalizer.UTF16.append;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public abstract class CsvManager extends FileManager{

   
    
    
    
    @Override
    public boolean write(String fileName, String data) {
        
        String file = null;
        
        try {
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            
            
            
            printWriter.flush();
            printWriter.close();
            
            
        } catch (Exception e) {
            System.out.println("");
        }

        return false;

    }

    @Override
    public ArrayList<String> read(String fileName) {
       
        return null;
       
    }

    @Override
    public boolean delete(String fileName, String criterion) {
        
        return false;
        
    }

    @Override
    public ArrayList<String> find(String filename, String criterion) {
        
        return null;
        
    }

    @Override
    public boolean update(String fileName, String criterion, String newData) {
        
        return false;
        
    }

    @Override
    public void insert() {
        
    }
    
}
