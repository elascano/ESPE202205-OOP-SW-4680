/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class FileManager implements Persistence{

    @Override
    public String read(String source) {
        System.out.println("Readind data from File"+ source);
        return "readed data";
    }

    @Override
    public boolean create(String table, Object object) {
        System.out.println("Creating" + object + "data in the File");
        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        System.out.println("updating"+object+"data in the File");
        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        System.out.println("Delete a record in the "+ criterion);
        return true;
    }
    
}
