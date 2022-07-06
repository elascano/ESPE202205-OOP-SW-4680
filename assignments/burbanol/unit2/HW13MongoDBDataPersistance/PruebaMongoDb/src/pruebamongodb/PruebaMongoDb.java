package pruebamongodb;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
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
//            crudBook.crearLibro(book);
//            System.out.println("/////////////////////////////");
//            crudBook.listarLibros();
//            crudBook.updateLibro();
//            System.out.println("/////////////////////////////");
//            crudBook.listarLibros();
            crudBook.deleteLibro();
            System.out.println("/////////////////////////////");
            crudBook.listarLibros();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
