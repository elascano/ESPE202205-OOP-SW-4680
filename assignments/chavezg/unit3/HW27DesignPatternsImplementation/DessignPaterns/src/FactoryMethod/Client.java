package FactoryMethod;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author Chavez Genaro, DCCO-ESPE, DAMAGE SE
 */
public class Client {

    public static void main(String[] args) {
        Factory factory;
        factory = new FactoryOne();
        Connection connection = factory.createConnection(Oracle); //Factory method
        System.out.println("You are connecting with " + connecton.description());
    }
}

