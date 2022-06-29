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
 * @author Elkin Pabon, DCCO ESPE, DEES DEVELOPERS
 */
public class Main {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        Scanner keye = new Scanner(System.in);
        MongoClient mongo = crearConexion();

        if (mongo != null) {
            DB db = mongo.getDB("dbTable");

            System.out.println("--  Please, enter an option : --" );
            int option = keye.nextInt();

            if (option == 1) {
                ViewCollection(db, "tbTable");
            }
            if (option == 2) {

                System.out.println("Enter model : ");
                String model = key.nextLine();
                System.out.println("Enter processor : ");
                String processor = key.nextLine();
                System.out.println("Enter RAMMemory : ");
                String RAMMemory = key.nextLine();
                System.out.println("Enter HDDCapacity : ");
                String HDDCapacity = key.nextLine();
                System.out.println("Enter Motherboard : ");
                String Motherboard = key.nextLine();
                InsertTable(db, "tbTable", model, processor, RAMMemory, HDDCapacity, Motherboard);
            }

            if (option == 3) {
                System.out.println("Enter Motherboard : ");
                String Motherboard = key.nextLine();
                DeleteDocument(db, "tbTable", Motherboard);
            }

            if (option == 4) {
                System.out.println("Enter model : ");
                String model = key.nextLine();
                SearchByColor(db, "tbTable", model);
            }

            if (option == 5) {
                System.out.println("Enter  processor : ");
                String processor = key.nextLine();
                System.out.println("Enter Update processor : ");
                String nuevo = key.nextLine();
                UpdateDocument(db, "tbTable", processor, nuevo);
            }

        }

    }

}


