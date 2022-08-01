/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
 */
public interface Persistence {
    public String read (String source);
    public boolean create (String table, Object object);
    public boolean update (String table, String criterion, Object object);
    public boolean delete (String table, String criterion);   
}
