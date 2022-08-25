/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class DatabaseManager implements Persistence{

    @Override
    public String read(String source) {
        return "readed";
    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("Creating data in the data base");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
      System.out.println("Updating data in the data base");
      return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
       System.out.println("Deleting data in the data base");
        return true;
    }
    
}
