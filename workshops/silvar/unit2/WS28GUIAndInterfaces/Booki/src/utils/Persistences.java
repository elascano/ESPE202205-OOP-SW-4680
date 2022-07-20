package utils;
/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public interface Persistences {
    public String read(String source);
    public boolean create(String table, Object objetc);
    public boolean update(String table, String criterion, Object object);
    public boolean delete(String table, String creation);
}
