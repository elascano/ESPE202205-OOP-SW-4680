
package factorymethod;

import ec.edu.espe.FactoryMethod.model.Connection;
import ec.edu.espe.FactoryMethod.model.Factory;
import ec.edu.espe.FactoryMethod.model.FactoryOne;

/**
 *
  * @author Martín Toapanta, DCCO-ESPE, MyWayCode
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factory factory;
        factory = new Factory();
        Connection connection = factory.createConnection(Oracle); //Factory method
        System.out.println("You are connecting with " + connecton.description());
    }
    
}
