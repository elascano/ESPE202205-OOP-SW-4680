package ec.edu.espe.FruitApp.view;
import com.mongodb.client.MongoCollection;
import ec.edu.espe.FruitApp.model.ConexionDB;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
/**
 *
 *@author Jose Imbaquinga, DCCO-ESPE, Syntax Error
 */
public class Motorcycle {
     DefaultTableModel tabla = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column) {
             return super.isCellEditable(row, column);
         }
     };

     public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
         MongoCollection<Document> MotorcycleCollection = new ConexionDB().GetDB().
                 getCollection("MotorcycleCollection");
        Document data= new Document();
        String motorcycleBrand,motorcycleColor,countryOfManufacture;
        int cylinderCapacity,maximumSpeed;       
        data.put("New motorcycle: \n",""); 
        System.out.println("Enter a new motorcycle");
        System.out.println("Enter the cylinderCapacity\n");
        cylinderCapacity=entrada.nextInt();
        data.put("Cylin", cylinderCapacity);
        System.out.println("Enter the brand of the motorcycle :");
        motorcycleBrand=entrada.next();
        data.put("Brand",motorcycleBrand);
        System.out.println("Enter the color of the motorcycle");
        motorcycleColor=entrada.next();
        data.put("Color",motorcycleColor);
        System.out.println("Enter the country of manufacture");
        countryOfManufacture=entrada.next();
        data.put("Country",countryOfManufacture);
        System.out.println("Enter the maximum speed");
        maximumSpeed=entrada.nextInt();
        MotorcycleCollection.insertOne(data);

         
        
    }
}

