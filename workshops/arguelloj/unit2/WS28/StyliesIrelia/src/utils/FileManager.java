package utils;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class FileManager implements Persistence {

    @Override
    public String read(String source) {
        System.out.println("Readind data in the file");
        return "returned data";
    }

    @Override
    public boolean create(String able, Object object) {
        System.out.println("Creating data in the file");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        System.out.println("Updating data in the file");
        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        System.out.println("Delete a record in the file"+ criterion);
        return true;
    }
}
