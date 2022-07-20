package utils;

/**
 *
 * @author ronny
 */
public class FileManager implements Persistence {

    @Override
    public String read(String source) {
        //code to read data from the source Mongo Atlas
        System.out.println("reading from File"+ source);
        return "returned data";
    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("creating" + object + "data in File");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        System.out.println("updating" + object + "data in the File");
        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        System.out.println("deleting a record " + criterion + "from File");
        return true;

    }

}
