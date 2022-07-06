
package pruebamongodb;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import com.mongodb.client.result.UpdateResult;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MSI
 */
public class CrudPen {

    private MongoDatabase mongoDB = Conexion.mongoDB;
    private String collectionPens = "pens";
    private MongoCollection <Document>mongoCollection = mongoDB.getCollection(collectionPens);

    public void crearPen(Pen pen) {
        
        mongoCollection.insertOne(pen.buildDocument());
    }

    public void listarPens() {

        FindIterable<Document> pens = mongoCollection.find();
        for (Document pen : pens) {
            System.out.println("pens" + pen.get("marca"));
        }

    }
    
    public void updatePen(){
        UpdateResult pen = mongoCollection.updateOne(eq("marca", "Bic"),combine(set("Marca", "Pelikan")));
        System.out.println(pen);
    }
    
    public void deletePen(){
        mongoCollection.deleteOne(eq("Marca", "Cross"));
    }

}
