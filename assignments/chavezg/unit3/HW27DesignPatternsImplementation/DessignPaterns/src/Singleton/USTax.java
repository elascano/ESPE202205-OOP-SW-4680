package Singleton;

/**
 *
 * @author Chavez Genaro, DCCO-ESPE, DAMAGE SE
 */
class USTax {
    private static USTax instance;
    private USTax();

    public static USTax getInstance() {
        if(instance == null)
            instance = new USTax();
        return instance;
}

    public float salesTotal() {

    }
}