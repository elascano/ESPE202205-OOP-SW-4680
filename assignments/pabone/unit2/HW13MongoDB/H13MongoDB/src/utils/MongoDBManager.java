package utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/**
 *
 * @author Elkin Pabon, DCCO ESPE, DEES DEVELOPERS
 */

public class MongoDBManager extends NoSqlManager{
    String collection;

    @Override
    public void insert() {
  }
       
      public static MongoClient crearConexion() {

        MongoClient mongo = null;
        mongo = new MongoClient("localhost", 27017);

        return mongo;
    }

    public static void InsertTable(DB db, String coleccion, String model,
            String processor, String RAMMemory, String HDDCapacity, String Motherboard) {

        DBCollection colec = db.getCollection(coleccion);
        BasicDBObject documento = new BasicDBObject();
        documento.put("model", model);
        documento.put("processor", processor);
        documento.put("RAMMemory", RAMMemory);
        documento.put("HDDCapacity", HDDCapacity);
        documento.put("Motherboard", Motherboard);
        colec.insert(documento);

    }

    public static void ViewCollection(DB db, String coleccion) {
        DBCollection colec = db.getCollection(coleccion);

        DBCursor cursor = colec.find();

        while (cursor.hasNext()) {
            System.out.println("* " + cursor.next().get("model") + " - "
                    + cursor.curr().get("processor") + " - " + cursor.curr().get("RAMMemory")
                    + " - " + cursor.curr().get("HDDCapacity") + " - " + cursor.curr().get("Motherboard"));
        }
    }

    public static void SearchByColor(DB db, String coleccion, String model) {
        DBCollection colect = db.getCollection(coleccion);

        BasicDBObject consulta = new BasicDBObject();
        consulta.put("model", model);

        DBCursor cursor = colect.find(consulta);
        while (cursor.hasNext()) {
            System.out.println("-- " + cursor.next().get("model") + " - "
                    + cursor.curr().get("processor") + " - " + cursor.curr().get("RAMMemory")
                    + " - " + cursor.curr().get("HDDCapacity") + " - " + cursor.curr().get("Motherboard"));
        }
    }

    public static void UpdateDocument(DB db, String coleccion, String processor, String nuevo) {
        DBCollection colec = db.getCollection(coleccion);

        BasicDBObject updateMaterial = new BasicDBObject();
        updateMaterial.append("$set", new BasicDBObject().append("processor", nuevo));

        BasicDBObject buscarPorNombre = new BasicDBObject();
        buscarPorNombre.append("processor", processor);

        colec.updateMulti(buscarPorNombre, updateMaterial);
    }

    public static void DeleteDocument(DB db, String coleccion, String Motherboard) {
        DBCollection colec = db.getCollection(coleccion);
        colec.remove(new BasicDBObject().append("Motherboard", Motherboard));
    }
    
    
}
