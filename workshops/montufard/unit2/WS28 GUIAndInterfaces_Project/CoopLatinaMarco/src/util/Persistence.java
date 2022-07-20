
package util;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public interface Persistence {
    public String read(String dataSource);
    public boolean create(String table,Object object);
    public boolean update(String table, String criterion, Object object);
    public boolean delete(String table, String criterion);
    
}
