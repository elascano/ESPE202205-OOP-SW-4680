
package ec.edu.espe.zoo.model1;

/**
 *
 * @author Loor Cesar,DDCO-ESPE,GADC.MSI
 */
public class Salmon extends Fish{

    public Salmon(int id, String description, String cage) {
        super(id, description, cage);
    }

    
    
    @Override
    public void feed() {
         System.out.println("Fedding a Salmon"); 
    }

    @Override
    public void addToZoo(Zoo zoo) {
         System.out.println("adding a Salmon to the Zoo -->" +zoo); 
        
    }
  
   
}
