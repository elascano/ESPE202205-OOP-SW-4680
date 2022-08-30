package ec.edu.espe.codeproject.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.codeproject.model.Customer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.bson.Document;


/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class CustomerController {

 
    public boolean register(Customer customer, JFrame frmFrame) {
        int reply;
        String message;
        message = customer.getName() + " is going to be added to the system";
        JOptionPane.showMessageDialog(frmFrame, message);
        message = customer.getName() + " Are you sure that you want to register "
                + customer.getName() + " to the system?";
        reply = JOptionPane.showConfirmDialog(frmFrame, message);

        if (reply == JOptionPane.YES_OPTION) {
            Document doc;
            doc = createDBObject(customer);
            MongoDatabase userDB = DBManager.getDatabase();
            MongoCollection<Document> col = userDB.getCollection("Customer");
            col.insertOne(doc);
            JOptionPane.showMessageDialog(frmFrame, "saving");
              return true;
        } else {
            JOptionPane.showMessageDialog(frmFrame, "it was not saved", "WARNING", JOptionPane.ERROR_MESSAGE);
              return false;
        }
    }

    public static Document createDBObject(Customer customer) {
        Document docBuilder = new Document();
        docBuilder.append("_id", customer.getId());
        docBuilder.append("name", customer.getName());
        docBuilder.append("adress", customer.getAdress());
        docBuilder.append("cellphone", customer.getCellPhone());
        docBuilder.append("email", customer.getEmail());
        return docBuilder;
    }
    
    public boolean delete(int id, JFrame frmFrame) {
        int reply;
        String message;
        message = id + " is going to be delete to the system";
        JOptionPane.showMessageDialog(frmFrame, message);
        message = id + " Are you sure that you want to delete "
                + id + " to the system?";
        reply = JOptionPane.showConfirmDialog(frmFrame, message);

        if (reply == JOptionPane.YES_OPTION) {
            try {
                MongoDatabase userDB = DBManager.getDatabase();
                MongoCollection<Document> col = userDB.getCollection("Customer");
                col.deleteOne(eq("_id", id));
                JOptionPane.showMessageDialog(frmFrame, "deleing");
                return true;
            } catch (ExceptionInInitializerError e) {
                JOptionPane.showMessageDialog(frmFrame, "it was not delete", "WARNING", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } else {
            JOptionPane.showMessageDialog(frmFrame, "it was not delete", "WARNING", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

}
