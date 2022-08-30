package Desingpatterns.singleton;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
class USTax{
  private static USTax instance;
  private USTax(){};
  public static USTax getInstance(){
    if(instance == null)
       instance=new USTax();
    return instance;
  }
  public float salesTotal(){
      System.out.println("Singleton");
      return 0;
  }
}
  
