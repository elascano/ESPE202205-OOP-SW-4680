package utils;

import javax.swing.text.Document;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public interface DataSoccerPlayers {


    public boolean create(Document doc, String coll);

    public String read(String table);

    public boolean update(String table, String criterion, Document doc, String TitleProperty);

    public boolean delete(String table, String criterion);

    public Document search(String coll, String field, String value);
}
