/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public abstract class DBManager extends Persistence {
    
    public abstract void create();
    public abstract void read();
    public abstract void update();
    public abstract void delete();
    
}
