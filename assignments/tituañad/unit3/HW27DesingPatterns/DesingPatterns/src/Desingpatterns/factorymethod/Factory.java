package Desingpatterns.factorymethod;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public abstract class Factory {
    
    public Factory(){
        
    }
    public abstract Connection createConnection(String type);
}
