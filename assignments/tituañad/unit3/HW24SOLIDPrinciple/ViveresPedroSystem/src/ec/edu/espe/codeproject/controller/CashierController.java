package ec.edu.espe.codeproject.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import ec.edu.espe.codeproject.model.Cashier;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author danie
 */
public class CashierController {
    public boolean mongo(Cashier cashier, JFrame frmFrame) {
        Document doc;
            doc = createDBObject(cashier);
            MongoDatabase userDB = DBManager.getDatabase();
            MongoCollection<Document> col = userDB.getCollection("Cashier");
            col.insertOne(doc);
            JOptionPane.showMessageDialog(frmFrame, "Has been saved successfully");
              return true;
        
    }
     public static Document createDBObject(Cashier cashier) {
        Document docBuilder = new Document();
        docBuilder.append("_id", cashier.getId());
        docBuilder.append("name", cashier.getName());
        docBuilder.append("adress", cashier.getAdress());
        docBuilder.append("cellphone", cashier.getCellPhone());
        docBuilder.append("email", cashier.getEmail());
        return docBuilder;
    }
}
