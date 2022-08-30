package ec.edu.espe.codeproject.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.codeproject.model.Inventory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author MARTIN
 */
public class InventoryController {
    public boolean mongo(Inventory inventory, JFrame frmFrame) {
        Document doc;
            doc = createDBObject(inventory);
            MongoDatabase userDB = DBManager.getDatabase();
            MongoCollection<Document> col = userDB.getCollection("Inventory");
            col.insertOne(doc);
            JOptionPane.showMessageDialog(frmFrame, "Has been saved successfully");
              return true;
        
    }
     public static Document createDBObject(Inventory inventory) {
        Document docBuilder = new Document();
        docBuilder.append("product", inventory.getProduct());
        docBuilder.append("code", inventory.getCode());
        docBuilder.append("type", inventory.getType());
        docBuilder.append("amount", inventory.getAmount());
        docBuilder.append("price", inventory.getPrice());
        docBuilder.append("discount", inventory.getDiscount());
        docBuilder.append("date", inventory.getDate());
        docBuilder.append("price", inventory.getPrice());
        return docBuilder;
    }
    }

