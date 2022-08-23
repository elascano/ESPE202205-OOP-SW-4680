
package ec.edu.espe.apartaments.controller;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class ConexionDB {
    ConnectionString connectionString = new ConnectionString("mongodb://JoseRicardoImbaquingaGuana:4W6rd8dhOUHeib5j@ac-sojrx8x-shard-00-00.kp5wq4w.mongodb.net:27017,ac-sojrx8x-shard-00-01.kp5wq4w.mongodb.net:27017,ac-sojrx8x-shard-00-02.kp5wq4w.mongodb.net:27017/?ssl=true&replicaSet=atlas-zp7hgt-shard-0&authSource=admin&retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("ApartamentDB");



 public void ConexionCustomer(String email, String fullName, int cellPhone, String type, String offter, String totalSale){
        MongoCollection<Document> FruitCollection = new ConexionDB().GetDB().
                 getCollection("ApartamentCollection");
     Document data= new Document();  
      DefaultTableModel tabla = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column) {
             return super.isCellEditable(row, column);
         }
     };  
      
}
