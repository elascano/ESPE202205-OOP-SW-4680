


import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class CrudOperations {
    public void addProfessor(int Id, String name, String lastName, String subject, int age){
    MongoDBConnection mongoDB;
    mongoDB = new MongoDBConnection();
    MongoClient userDB;
    MongoDatabase userdatabase;
    MongoCollection userCollection;
    Document document;
    
    userDB= mongoDB.conectionMongo();
    userdatabase=userDB.getDatabase("ExamUnit2");
    userCollection= userdatabase.getCollection("Professor");

    document=new Document();
    
        document.append("Name",name);
        document.append("lastName",lastName);
        document.append("Id",Id);
        document.append("Subject",subject);
        document.append("Age",age);

        
        userCollection.insertOne(document);
        JOptionPane.showMessageDialog(null, "The data has been saved successfully");
    }
    
    
    
}
