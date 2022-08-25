package Singleton;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
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