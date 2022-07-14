package utils;

/**
 *
 * @author Elkin Pabon, DCCO ESPE, DEES Developers
 */

public class DatabaseManager implements Persistence{

    @Override
    public String read(String source) {
        System.out.println("Reading data from database");
        return "Returned data";
    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("Creating data in the database");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        System.out.println("Updating data in the database");
        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        System.out.println("Deleting data in the database");
        return true;
    }   
}
