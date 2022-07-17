
package utils;

/**
 *
 * @author Elkin Pabon, DCCO ESPE, DEES developers
 */
public class FileManager implements Persistence {

    @Override
    public String read(String source) {
        System.out.println("Reading data from FILE" + source);
        return "Returned data";
    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("Creating data in the FILE");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        System.out.println("Updating data in the FILE");
        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        System.out.println("Deleting a record" + criterion + "in the FILE");
        return true;
    }
}
