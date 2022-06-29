package utils;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public abstract class DBManager extends Persistence{
    public abstract void create();
    public abstract void read();
    public abstract void update();
    public abstract void delete();
}
