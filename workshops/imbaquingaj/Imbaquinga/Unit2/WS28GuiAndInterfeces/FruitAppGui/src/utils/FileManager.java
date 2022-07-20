/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class FileManager implements Persistence {
    @Override
    public String read(String source) {
        System.out.println("Reading data from File"+source);
        return "returned data";
    }

    @Override
    public boolean create(String table, Object object) {
         System.out.println("Create data  from File");

        return true;
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
       System.out.println("Update data from File");

        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        System.out.println("Delete data from File");

        return true;
    }
}
