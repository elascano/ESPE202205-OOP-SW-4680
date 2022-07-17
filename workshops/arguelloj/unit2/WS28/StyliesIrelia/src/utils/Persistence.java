package utils;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public interface Persistence {
    public String read(String source);
    public boolean create(String able, Object object);
    public boolean update(String table, String criterion, Object object);
    public boolean delete(String table, String criterion);
}
