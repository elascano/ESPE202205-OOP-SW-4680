package Desingpatterns.factorymethod;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class MySqlConnection extends Connection{
   public MySqlConnection(){
       
   }
   @Override
   public String description(){
      return"MySQL";
   }
}
