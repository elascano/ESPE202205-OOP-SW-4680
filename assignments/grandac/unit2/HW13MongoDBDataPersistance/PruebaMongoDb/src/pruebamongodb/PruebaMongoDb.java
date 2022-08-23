package pruebamongodb;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Carlos Granda, DCCO- ESPE, Syntax Error
 */
public class PruebaMongoDb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        MongoDatabase mongoDB = conexion.obtenerConexion();

        
        
        
        try {
            CrudBook crudBook = new CrudBook();
            crudBook.listarLibros();

            Book book = new Book();
            book.setTitle("Mero mia mor2233");

            crudBook.deleteLibro();
            System.out.println("/////////////////////////////");
            crudBook.listarLibros();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
