package Utils;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public abstract class DBManager extends Persistence {
    
    public abstract void create();
    public abstract void read();
    public abstract void update();
    public abstract void delete();
}
