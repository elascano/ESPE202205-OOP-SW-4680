package utils;

/**
 *
 * @author Ronny Ibarra,DCCO-ESPE, Syntax Error
 */
public interface Persistence {
    public String read(String source);
    public boolean create(String table, Object object);
    public boolean update(String table, String criterion, Object object);
    public boolean delete(String table, String criterion);
    
}
