
package ec.edu.espe.LeatherFlowerSystemProject.model;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public abstract class Treatment extends Service {

    public Treatment(String type, String date, String hourOfAttention, float cost) {
        super(type, date, hourOfAttention, cost);
    }
    
    
}
