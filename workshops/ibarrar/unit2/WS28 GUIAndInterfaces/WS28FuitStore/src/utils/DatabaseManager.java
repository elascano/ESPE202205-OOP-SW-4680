package utils;

/**
 *
 * @author ronny
 */
public class DatabaseManager implements Persistence {

    @Override
    public String read(String source) {
        //code to read data from the source Mongo Atlas
        System.out.println("reading from database");
        return "returned data";
    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("creating data in database");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        System.out.println("updating data in the database");
       return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        System.out.println("deleting a record from database");
                return true;
    }
    
    
}
