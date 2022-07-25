package utils;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class FileManager implements Persistence {

    @Override
    public String read(String source) {
        System.out.println("reading data from FILE" + source);
        
        return "returned data";
    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("creating" + object + "data in the FILE");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        System.out.println("updating" + object + "data in the FILE");
        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        System.out.println("deleting data a record" + criterion + "from FILE");
        return true;
    }

}
