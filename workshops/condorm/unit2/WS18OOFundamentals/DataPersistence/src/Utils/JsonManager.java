/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.util.ArrayList;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class JsonManager extends FileManager{

    @Override
    public void insert() {
        
    }

    @Override
    public boolean write(String fileName, String data) {
        return true;
    }

    @Override
    public ArrayList<String> read(String fileName) {
        return null;
    }

    @Override
    public boolean delete(String fileName, String criterion) {
        return false;
    }

    @Override
    public ArrayList<String> find(String fileName, String criterion) {
        return null;
    }

    @Override
    public boolean update(String fileName, String criterion, String newData) {
        return false;
    }
    
}