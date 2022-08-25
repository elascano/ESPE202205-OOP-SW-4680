
package ec.edu.espe.code.model;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class USTax {
    private static USTax instance;

    private USTax() {
    }
    
    public static USTax getInstance() {
    if(instance == null)
    instance = new USTax();
    return instance;
}

public float salesTotal() {
    System.out.println("Singleton");
        return 0;
}
}
