package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class CsvManager extends FileManager {

     @Override
    public boolean write(String fileName, String data) {
        
        String pathCsv;
        
        pathCsv = System.getProperty("user.dir")+ "\\" + fileName;
        
        File file = new File(pathCsv);
        
        
        try{
            FileWriter fileWriter;
        
            BufferedWriter bufferedWriter;
            
            file.exists();
        
           if (!file.exists()){
               file.createNewFile();
               fileWriter = new FileWriter(pathCsv);
           }else{
               fileWriter = new FileWriter(pathCsv, true);
           }
           
           bufferedWriter = new BufferedWriter(fileWriter);
           
           bufferedWriter.append(data);
           bufferedWriter.close();
           
           
           
        }
        catch (Exception e){
            System.out.println(e); 
        }
        
        return true;
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
    public ArrayList<String> find(String fileName, String criterion) {
       return null;
    }

    @Override
    public boolean update(String fileName, String criterion, String newData) {
       return false;
    }

    @Override
    public void insert() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
