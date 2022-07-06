
package utils;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public abstract class DBManager extends Persistence {
    String dbName;
    public abstract void Create();
    public abstract void Read();
    public abstract void Update();
    public abstract void Delete();
    
    
}
