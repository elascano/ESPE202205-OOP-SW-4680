/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw27desingpatterns.factorymethod;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Client {

    public static void main(String[] args) {
        Factory factory;
        factory = new FactoryOne();
        Connection connection = factory.createConnection("Oracle");// Factory method
        System.out.println("You are connecting with" + connection.description());
    }
}
