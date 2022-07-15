
package utils;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public interface Persistence {     //La interface se llama persistencia
    public String read(String source);
    public boolean create(String table, Object object);
    public boolean update(String table, String criterion, Object object );
    public boolean delete(String table, String criterion);


   
}
