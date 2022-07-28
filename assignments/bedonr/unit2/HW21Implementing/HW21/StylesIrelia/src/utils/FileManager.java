
package utils;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class FileManager implements Persistence{
      
    
    @Override
    public String read(String source) {
        //code para leer los datos del mongo db atlas
        System.out.println("leyendo el registro desde el archivo");
        return "returned data";  
    }

    @Override
    public boolean create(String table, Object object) {
                System.out.println("Creando" + object + "desde el archivo");

        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
                System.out.println("Descargando " + object + "desde el archivo");

        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
               System.out.println("Eliminando el registro" + criterion + "desde el archivo");

        
        return true;
    }
        
}
