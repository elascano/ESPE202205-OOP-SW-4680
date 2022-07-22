/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import utils.MongoDBManager;



/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class DBTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MongoDBManager mdb;
        mdb= new MongoDBManager();
        mdb.Delete();
    }
    
}
