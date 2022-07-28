
package ec.edu.espe.FruitApp.controller;

import ec.edu.espe.FruitApp.model.ConexionDB;
import com.mongodb.client.MongoCollection;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Carlos Granda,Jose Imbaquinga, Roony Ibarra, DCCO-ESPE, Syntax Error
 */
public class ConexionMongoDBCustomer {
      
   
    public void ConexionCustomer(String email, String fullName, int cellPhone, String type, String offter, String totalSale){
        MongoCollection<Document> FruitCollection = new ConexionDB().GetDB().
                 getCollection("FruitCollection");
     Document data= new Document();  
      DefaultTableModel tabla = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column) {
             return super.isCellEditable(row, column);
         }
     };  
        
        data.put("Customer","");
        data.put("Id",email);
        data.put("Full Name",fullName);
        data.put("Email:",+cellPhone);
        data.put("Type",type);
        data.put("Float",offter);
        data.put("Total Sale",totalSale);
        FruitCollection.insertOne(data);

    }
    
    
    
    
    
 
}
