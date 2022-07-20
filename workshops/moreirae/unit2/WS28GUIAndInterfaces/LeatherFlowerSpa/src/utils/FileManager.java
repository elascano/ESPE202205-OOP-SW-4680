
package utils;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class FileManager implements Persistence {
     @Override
    public String read(String source) {
        //code to read data from the source (mongoDb Atlas)
        System.out.println("reading data from FILE " + source);
       return "returned data";
    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("creating " + object + "data in the FILE");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
       System.out.println("updating data " + object +  " in the FILE");
        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
       System.out.println("deleting  a record" + criterion +  "from FILE");
        return true;
    }
}
