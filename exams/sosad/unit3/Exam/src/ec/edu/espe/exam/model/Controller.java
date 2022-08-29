
package ec.edu.espe.exam.model;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.exam.utils.DBManager;
import ec.edu.espe.exam.view.Num;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.bson.Document;


/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Controller {
     public boolean register(Num num, JFrame frmFrame) {
        int reply;
        String message;
        message = num.getUnsorted()+ " is going to be added to the system";
        JOptionPane.showMessageDialog(frmFrame, message);
        message = num.getUnsorted() + " Are you sure that you want to add "
                + num.getUnsorted() + " to the system?";
        reply = JOptionPane.showConfirmDialog(frmFrame, message);

        if (reply == JOptionPane.YES_OPTION) {
            Document doc;
            doc = createDBObject(num);
            MongoDatabase userDB = DBManager.getDatabase();
            MongoCollection<Document> col = userDB.getCollection("Array");
            col.insertOne(doc);
            JOptionPane.showMessageDialog(frmFrame, "saving");
            return true;
        } else {
            JOptionPane.showMessageDialog(frmFrame, "it was not saved", "WARNING", 
            JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static Document createDBObject(Num num) {
        Document docBuilder = new Document();
        docBuilder.append("Unsorted", num.getUnsorted());
        docBuilder.append("Size", num.getSize());
        docBuilder.append("Sort algorithm", num.getSort());
        docBuilder.append("Sorted", num.getSorted());
        return docBuilder;
    }
}
