/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author H301
 */
public class Filemanager implements Persistance{

     @Override
    public boolean create(String table, Object object) {
        
        System.out.println("Creating from File");
        return true;
    }

    @Override
    public String read(String source) {
        System.out.println("reading from File");
        return "data returned";//polmorfismo y sobreescritura
    }

    @Override
    public boolean update(String table, String criterion, Object object) {
        
        System.out.println("updating from File");
        return true;
    }

    @Override
    public boolean delete(String table, String criterion) {
        
        System.out.println("deleating from File");
        return true;
    }
    
}
