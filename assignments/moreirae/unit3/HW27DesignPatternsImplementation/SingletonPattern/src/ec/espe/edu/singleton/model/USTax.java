
package ec.espe.edu.singleton.model;

public class USTax {
    
    private static USTax instance;
    
    private USTax(){};
    
    public static USTax getInstance(){
        if(instance == null){
            instance = new USTax();
        }
        return instance;
    }
    public float salesTotal(){
        
        return (float) 8.87;
        
    }
}
