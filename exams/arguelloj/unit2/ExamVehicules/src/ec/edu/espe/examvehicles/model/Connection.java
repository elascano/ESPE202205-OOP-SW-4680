package ec.edu.espe.examvehicles.model;

import com.mongodb.client.*;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class Connection {
        public static MongoDatabase mongodb = null;

    public MongoDatabase connectionDataBase() {

        if (mongodb == null) {
            String uri = "mongodb+srv://joel:R6cjoel2019@joel.crhww.mongodb.net/?retryWrites=true&w=majority";
            String db = "joel";

            MongoClient mongoClient = MongoClients.create(uri);

            Connection.mongodb = mongoClient.getDatabase(db);
        }

        return Connection.mongodb;

    }
}
