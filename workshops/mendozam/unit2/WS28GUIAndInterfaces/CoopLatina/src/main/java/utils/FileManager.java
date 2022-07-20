/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author aldma
 */
public class FileManager implements Persistence{
    
    @Override
    public String read(String source) {
        System.out.println("reading data from FILE" + source);
        return "returned data";
    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("creating" +object+ "data in the FILE");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        System.out.println("deleting a record" +criterion+ "from FILE");
        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        System.out.println("deleting data from database");
        return true;
    }
    
}
