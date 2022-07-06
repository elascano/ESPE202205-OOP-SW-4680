package longmessagechains;

/**
 *
 * @author Elkin Pabon, DCCO-ESPE, DEES Developers
 */

public class LongMessageChains {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        obj ob = new obj();
        int id = obj.getDept().getSubDept().getHOD().getid();
        
        // Message chain is a code smell where we are calling a method 
        // on an object and then calling another method 
        // on that returned object and so on.
        
        
         
        
//       Object1 object1;
//       Object2 object2;
//       object1 =new Object1(5, "jose");
//       
//       object2 =new Object2(6, "joseMaria");
//        System.out.println(object1.getName());
    }
    
}
