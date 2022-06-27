package utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class MongoDBManager extends NoSqlManager{
    String collection;

    @Override
    public void insert() {
  }
       
      public static MongoClient crearConexion() {
        System.out.println("TEST MONGODB CONNECTION");
        
        MongoClient mongo = null;

        mongo = new MongoClient("localhost", 27017);

        return mongo;
    }

    public static void InsertTable(DB db, String coleccion, String color,
            String material, String style, String height, String width) {

        DBCollection colec = db.getCollection(coleccion);
        BasicDBObject documento = new BasicDBObject();
        documento.put("color", color);
        documento.put("material", material);
        documento.put("style", style);
        documento.put("height", height);
        documento.put("width", width);
        colec.insert(documento);

    }

    public static void ViewCollection(DB db, String coleccion) {
        DBCollection colec = db.getCollection(coleccion);

        DBCursor cursor = colec.find();

        while (cursor.hasNext()) {
            System.out.println("* " + cursor.next().get("color") + " - "
                    + cursor.curr().get("material") + " - " + cursor.curr().get("style")
                    + " - " + cursor.curr().get("height") + " - " + cursor.curr().get("width"));
        }
    }

    public static void SearchByColor(DB db, String coleccion, String color) {
        DBCollection colect = db.getCollection(coleccion);

        BasicDBObject consulta = new BasicDBObject();
        consulta.put("color", color);

        DBCursor cursor = colect.find(consulta);
        while (cursor.hasNext()) {
            System.out.println("-- " + cursor.next().get("color") + " - "
                    + cursor.curr().get("material") + " - " + cursor.curr().get("style")
                    + " - " + cursor.curr().get("height") + " - " + cursor.curr().get("width"));
        }
    }

    public static void UpdateDocument(DB db, String coleccion, String material, String nuevo) {
        DBCollection colec = db.getCollection(coleccion);

        BasicDBObject updateMaterial = new BasicDBObject();
        updateMaterial.append("$set", new BasicDBObject().append("material", nuevo));

        BasicDBObject buscarPorNombre = new BasicDBObject();
        buscarPorNombre.append("material", material);

        colec.updateMulti(buscarPorNombre, updateMaterial);
    }

    public static void DeleteDocument(DB db, String coleccion, String width) {
        DBCollection colec = db.getCollection(coleccion);
        colec.remove(new BasicDBObject().append("width", width));
    }
    
    
}
