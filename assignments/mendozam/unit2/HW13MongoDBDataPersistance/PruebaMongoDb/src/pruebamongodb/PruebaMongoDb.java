package pruebamongodb;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Mateo Mendoza, DCCO-ESPE, GADC.MSI
 */
public class PruebaMongoDb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        MongoDatabase mongoDB = conexion.obtenerConexion();

        
        try {
            CrudPen crudPen = new CrudPen();
            crudPen.listarPens();

            Pen pen = new Pen();
            pen.setTitle("Bic1221");
//            crudPen.crearPen(pen);
//            System.out.println("/////////////////////////////");
//            crudPen.listarPens();
//            crudPen.updatePen();
//            System.out.println("/////////////////////////////");
//            crudPen.listarPens();
            crudPen.deletePen();
            System.out.println("/////////////////////////////");
            crudPen.listarPens();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
