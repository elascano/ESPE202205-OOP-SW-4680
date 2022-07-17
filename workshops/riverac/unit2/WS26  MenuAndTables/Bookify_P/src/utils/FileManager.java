package utils;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class FileManager implements Persistence{

    @Override
    public String read(String source) {
        System.out.println("reading data from FILE" +source);
        return"returned data";
    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("creating data " +object+ " in the FILE");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        System.out.println("updating " +object+ " data in the FILE"); 
        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        System.out.println("deliting a record " +criterion+ " from FILE");
        return true;
    }   
}
