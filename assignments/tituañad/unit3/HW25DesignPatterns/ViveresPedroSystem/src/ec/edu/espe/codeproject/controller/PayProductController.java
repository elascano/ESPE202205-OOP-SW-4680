package ec.edu.espe.codeproject.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.codeproject.model.ProductPay;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.bson.Document;


/**
 *
* @author Daniela Tituaña, DCCO - ESPE,MyWayCode */
public class PayProductController {
    public void total(ProductPay productPay, JTextField txtField, float totalPay, float unit, float price){
        
       totalPay = price*unit; 
       txtField.setText("$"+totalPay);
   }
    
   
    public boolean mongo(ProductPay productPay, JFrame frmFrame) {
        Document doc;
            doc = createDBObject(productPay);
            MongoDatabase userDB = DBManager.getDatabase();
            MongoCollection<Document> col = userDB.getCollection("Product Day ");
            col.insertOne(doc);
              return true;
        
    }
    public static Document createDBObject(ProductPay productPay)
    {
        Document docBuilder = new Document();
        docBuilder.append("name", productPay.getName());
        docBuilder.append("id", productPay.getId());
        docBuilder.append("totalPay", productPay.getTotalPay());
        docBuilder.append("price", productPay.getPrice());
        docBuilder.append("unit", productPay.getUnit());
        docBuilder.append("invoice", productPay.getInvoice());
        
        
       
        return docBuilder;
    }
    public void total(ProductPay productPay, JTextField txtField, float totalPayIva, float totalPay ){
        
       totalPayIva = (float) (totalPay*0.12+totalPay); 
       txtField.setText("$"+totalPayIva);
   } 
}

