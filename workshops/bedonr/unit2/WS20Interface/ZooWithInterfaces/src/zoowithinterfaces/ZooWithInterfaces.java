
package zoowithinterfaces;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class ZooWithInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IAnimal iAnimal;
        
        iAnimal = new Cow();
        iAnimal.fedd();
        
        System.out.println("iAnimal -->" +iAnimal.getClass());
        
        
    }
    
}
