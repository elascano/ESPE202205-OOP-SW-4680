package utils;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class DataBaseManager implements Persistence {

    @Override
    public String read(String source) {
        System.out.println("Readind data from database");
        return "returned data";
    }

    @Override
    public boolean create(String able, Object object) {
        System.out.println("Creating data from the database");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        System.out.println("Updating data from the database");
        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        System.out.println("Delete a record  from the database");
        return true;
    }

}
