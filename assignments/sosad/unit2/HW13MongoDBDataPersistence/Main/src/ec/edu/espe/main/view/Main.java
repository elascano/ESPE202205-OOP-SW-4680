
package ec.edu.espe.main.view;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.util.Scanner;
import static utils.MongoDBManager.DeleteDocument;
import static utils.MongoDBManager.InsertTable;
import static utils.MongoDBManager.SearchByColor;
import static utils.MongoDBManager.UpdateDocument;
import static utils.MongoDBManager.ViewCollection;
import static utils.MongoDBManager.crearConexion;



/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Main {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        Scanner keye = new Scanner(System.in);
        MongoClient mongo = crearConexion();

        if (mongo != null) {
            DB db = mongo.getDB("dbTable");

            System.out.println("DATABASE CREATED");

            System.out.println("Please enter an option : ");
            int option = keye.nextInt();

            if (option == 1) {
                ViewCollection(db, "tbTable");
            }
            if (option == 2) {

                System.out.println("Enter color : ");
                String color = key.nextLine();
                System.out.println("Enter material : ");
                String material = key.nextLine();
                System.out.println("Enter style : ");
                String style = key.nextLine();
                System.out.println("Enter height : ");
                String height = key.nextLine();
                System.out.println("Enter width : ");
                String width = key.nextLine();
                InsertTable(db, "tbTable", color, material, style, height, width);
            }

            if (option == 3) {
                System.out.println("Enter width : ");
                String width = key.nextLine();
                DeleteDocument(db, "tbTable", width);
            }

            if (option == 4) {
                System.out.println("Enter color : ");
                String color = key.nextLine();
                SearchByColor(db, "tbTable", color);
            }

            if (option == 5) {
                System.out.println("Enter  material : ");
                String material = key.nextLine();
                System.out.println("Enter Update material : ");
                String nuevo = key.nextLine();
                UpdateDocument(db, "tbTable", material, nuevo);
            }

        }

    }

}


