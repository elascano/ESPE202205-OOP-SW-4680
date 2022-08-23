package utils;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.SoccerPlayers.controller.DataBaseManagerController;
import javax.swing.text.Document;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class DataBaseManager implements DataSoccerPlayers{

    @Override
    public boolean create(Document doc, String coll) {
        MongoCollection<org.bson.Document> collection = DataBaseManagerController.database.getCollection(coll);
        collection.insertOne((org.bson.Document) doc);

        return true;
    }

    @Override
    public String read(String table) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean update(String table, String criterion, Document doc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String table, String criterion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Document search(String coll, String field, String value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(String table, String criterion, Document doc, String TitleProperty) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
