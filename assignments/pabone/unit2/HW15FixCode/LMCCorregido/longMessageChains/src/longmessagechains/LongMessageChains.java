package longmessagechains;

/**
 *
 * @author  Ronny Ibarra, DCCO- ESPE, Syntax Error
 */

public class LongMessageChains {

    public static void main(String[] args) {
        
     Obj obj;
     
      Object1 object1;
      Object2 object2;
      obj = new Obj(4,5,6,7);
      object1 =new Object1(5, "jose");
       
       object2 =new Object2(6, "joseMaria");
        System.out.println(object1);
        System.out.println(object2);
        
        System.out.println(obj);
    }
    
}
