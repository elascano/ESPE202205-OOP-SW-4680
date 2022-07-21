
package utils;

import utils.Persistence;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class FileManager implements Persistence {
        @Override
    public String read(String source) {
        System.out.println("read data from database"+source);
        return "returned data";
    }

    @Override
    public boolean create(String table, Object obejct) {
        System.out.println("creating data from database"+obejct+"data in the FILE");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        System.out.println("update data from database"+object+"Data in the FILE");
        return true;

    }

    @Override
    public boolean delete(String table, String criterion) {
         System.out.println("delete data from database"+criterion+"fromFile"); 
         return true;
    }
    
    
}
