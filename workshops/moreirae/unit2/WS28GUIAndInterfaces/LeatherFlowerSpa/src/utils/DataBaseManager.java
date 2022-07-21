
package utils;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class DataBaseManager implements Persistence {

    @Override
    public String read(String source) {
        //code to read data from the source (mongoDb Atlas)
        System.out.println("reading data from database");
       return "returned data";
    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("creating data in the database");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
       System.out.println("updating data in the database");
        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
       System.out.println("deleting  a record in the database");
        return true;
    }
    
}
