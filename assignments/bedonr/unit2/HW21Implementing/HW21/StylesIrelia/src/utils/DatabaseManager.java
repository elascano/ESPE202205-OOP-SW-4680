package utils;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class DatabaseManager implements Persistence {

    @Override
    public String read(String source) {
        //code para leer los datos del mongo db atlas
        System.out.println("leyendo la base de datos");
        return "returned data";
    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("creando la base de datos");

        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        System.out.println("Descargando la base de datos");

        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        System.out.println("Eliminando la base de datos");

        return true;
    }

}
