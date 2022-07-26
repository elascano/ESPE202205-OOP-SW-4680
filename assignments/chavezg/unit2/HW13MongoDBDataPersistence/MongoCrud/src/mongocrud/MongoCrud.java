package mongocrud;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE, DAMAGE SE
 */
public class MongoCrud {

    public static void main(String[] args) {
        
        Connection connection = new Connection();
        MongoDatabase mongodb = connection.connectionDataBase();
        TablesCrud tableCrud = new TablesCrud();
        
        Table table = new Table();
        
        table.setName("acacia");
        table.setPrice(90);
        
        tableCrud.createTable(table);
        tableCrud.readTable();
        tableCrud.updateTable();
        tableCrud.deleteTable();
        tableCrud.readTable();
    }
    
}
