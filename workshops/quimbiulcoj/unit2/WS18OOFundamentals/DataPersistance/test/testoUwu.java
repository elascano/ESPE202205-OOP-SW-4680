
import Utils.MongoDBManager;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class testoUwu {
    
   public static void main(String[] args) {
      MongoDBManager dbManager;
      
    dbManager = new MongoDBManager();
    dbManager.Connection();
    //dbManager.create();
    dbManager.update();
    //dbManager.read();
    
   }
}
