/*;

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

/**
 *
 * @author H301
 */
public interface Persistance {
    
    public boolean create(String table,Object object);//Firma del metodo
    public String read(String source);
    public boolean update(String table, String criterion,Object object);
    public boolean delete(String table, String criterion);
    
}
