package util;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class DatabaseManager implements Persistence {

    @Override
    public String read(String dataSource) {
        //code
        System.out.println("reading data from database");
        return "returend data";
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
        System.out.println("delete data from database");
        return true;
    }

}
