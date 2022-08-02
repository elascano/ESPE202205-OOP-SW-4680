/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class DatabaseManager implements Persistance {

    @Override
    public String read(String source) {
        System.out.println("reading");
        return "String";

    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("createing in database");
        return false;
    }

    @Override
    public boolean update(String table, String criterio, Object object) {
        System.out.println("update in database");
        return false;
    }

    @Override
    public boolean delete(String table, String criterio) {
        System.out.println("deleting");
        return false;
    }

}
