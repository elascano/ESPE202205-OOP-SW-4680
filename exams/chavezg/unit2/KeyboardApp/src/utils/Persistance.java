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
public interface Persistance {
    public String read(String source);
    public boolean create(String table, Object object);
    public boolean update(String table, String criterio, Object object);
    public boolean delete(String table, String criterio);
    
    
}
