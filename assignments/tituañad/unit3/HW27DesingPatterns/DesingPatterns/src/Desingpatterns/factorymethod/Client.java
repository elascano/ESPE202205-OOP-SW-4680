package Desingpatterns.factorymethod;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class Client {

    public static void main(String[] args) {
        Factory factory;
        factory = new FactoryOne();
        Connection connection = factory.createConnection("Oracle");// Factory method
        System.out.println("You are connecting with" + connection.description());
    }
}
