package utils;

import java.util.ArrayList;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class JsonManager extends FileManager {

    @Override
    public void insert() {
    }

    @Override
    public boolean write(String fileName, String data) {
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
    public boolean update(String criterion, String newData) {

        return false;

    }

}
