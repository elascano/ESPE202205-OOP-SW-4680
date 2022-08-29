/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw27desingpatterns.factorymethod;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class OracleConnection extends Connection {

    public OracleConnection() {

    }

    public String description() {

        return "Oracle";
    }
}
