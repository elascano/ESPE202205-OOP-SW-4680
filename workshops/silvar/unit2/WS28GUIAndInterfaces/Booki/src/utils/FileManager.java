/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class FileManager implements Persistences{

    @Override
    public String read(String source) {
        //code to read  data from te resource (mongoDB atlas)
        System.out.println("reading data from FILE"+ source);
        return "returned data";
    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("creating" +object+ "data in FILE");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        System.out.println("uodating" +object+ "data from FILE");
        return true;
    }

    @Override
    public boolean delete(String table, String creation) {
        System.out.println("Deleting data from FILE");
        return true;
    }
}
