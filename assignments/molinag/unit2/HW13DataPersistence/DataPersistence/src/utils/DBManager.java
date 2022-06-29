package utils;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public abstract class DBManager extends Persistence {
    String dbName;
    public abstract void create();
    public abstract void read();
    public abstract void update();
    public abstract void delete();
}
