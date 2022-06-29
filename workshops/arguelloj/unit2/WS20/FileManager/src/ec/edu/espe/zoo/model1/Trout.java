
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Trout extends Fish{

    public Trout(int id, String description, String cage) {
        super(id, description, cage);
    }
    
    
    
    @Override
    public void feed() {
         System.out.println("Fedding a Trout"); 
    }
    

    @Override
    public void addToZoo(Zoo zoo) {
         System.out.println("adding a Trout to the Zoo -->" +zoo); 
        
    }
  
}
