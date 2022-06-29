package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class JsonManager extends FileManager {

    public void insert() {
    }
    
    
    
    @Override
    public boolean write(String fileName, String data) {

        String pathJson;

        pathJson = System.getProperty("user.dir") + "\\" + fileName;

        File file = new File(pathJson);

        try {

            FileWriter fileWriter;

            BufferedWriter bufferedWriter;

            if (!file.exists()) {
                file.createNewFile();
                fileWriter = new FileWriter(pathJson);
            } else {
                fileWriter = new FileWriter(pathJson, true);
            }

            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.append(data);
            bufferedWriter.close();

        } catch (Exception e) {

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
    public ArrayList<String> find(String fileName, String criterion) {

        return null;

    }

    @Override
    public boolean update(String fileName, String criterion, String newData) {

        return false;

    }

}
