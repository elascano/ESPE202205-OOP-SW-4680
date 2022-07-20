package utils;

/**
 *
 * @author David Montufar, DCCO-ESPE GADC.msi
 */
public class Database implements Persistence {

    @Override
    public String read(String source) {
        System.out.println("reading data from database");
        return "returned data";
    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("creating data from database");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        System.out.println("updating data from database");
        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        System.out.println("deleting data in the database");
        return true;
    }

}
