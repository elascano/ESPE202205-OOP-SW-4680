package utils;

import java.util.ArrayList;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class CsvManager extends FileManager {

    public void insert() {
    }

    @Override
    public boolean write(String fileName, String data) {

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
