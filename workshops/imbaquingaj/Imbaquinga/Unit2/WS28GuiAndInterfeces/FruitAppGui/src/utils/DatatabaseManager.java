
package utils;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class DatatabaseManager implements Persistence{

    @Override
    public String read(String source) {
        System.out.println("Reading data from database");
        return "returned data";
    }

    @Override
    public boolean create(String table, Object object) {
         System.out.println("Create data from database");

        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
       System.out.println("Update data from database");

        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        System.out.println("Delete data from database");

        return true;
    }
    
}
