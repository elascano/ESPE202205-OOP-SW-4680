/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw27desingpatterns.factorymethod;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class FactoryOne extends Factory {

    public Connection createConnection(String type) {
        if (type.equals("Oracle")) {
            return new OracleConnection();
        } else {
            return new MySqlConnection();
        }
    }
}
