package Utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class JsonManager extends FileManager {

   

    @Override
    public boolean write(String fileName, String data) {
        
        String pathJson;
        
       pathJson=System.getProperty("user.dir")+"\\"+fileName;
       File file= new File (pathJson);
       
       
       try{
           FileWriter fileWriter = new FileWriter(file);
           
           BufferedWriter bufferedWriter;
           if (!file.exists()){
               file.createNewFile();
               fileWriter = new FileWriter(pathJson);
               
           }else{
               fileWriter = new FileWriter(pathJson, true);
             
           }
           bufferedWriter =  new BufferedWriter(fileWriter);
           
           bufferedWriter.append(data);
           bufferedWriter.close();
           
       } catch (Exception e){
           System.out.println(e);
       }
        //To do write in a json file
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
    public ArrayList<String> find(String fileName, String criterion) {
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
