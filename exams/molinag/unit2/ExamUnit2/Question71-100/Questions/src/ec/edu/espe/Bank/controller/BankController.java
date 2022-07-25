package ec.edu.espe.Bank.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.Bank.model.Bank;
import org.bson.Document;


/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class BankController {
String collection;
    MongoDatabase ExamDB;
    MongoCollection ExamCollection;
    Document document;
    
    public MongoDatabase EstablishConnection() {
        MongoClientURI clientURI;
        MongoClient client;
        MongoDatabase userdatabase;
            
        String uri = "mongodb+srv://Steven1:Steven1@cluster0.kgejk.mongodb.net/?retryWrites=true&w=majority";

        clientURI = new MongoClientURI(uri);
        client = new MongoClient(clientURI);
        System.out.println("Conexion Exitosa");

        userdatabase = client.getDatabase("Exam");

        return userdatabase;

    }
    public void CreateBank(Bank bank) {

        
        ExamDB = EstablishConnection();
        ExamCollection = ExamDB.getCollection("Bank");

        document = new Document();
        
        document.append("Name", bank.getName());
        document.append("Id", bank.getId());
        document.append("Located", bank.getLocated());
        document.append("Date of fundation", bank.getDateOfFundation());
        document.append("Number of customers", bank.getNumberOfCustomers());


        ExamCollection.insertOne(document);

    }
}
