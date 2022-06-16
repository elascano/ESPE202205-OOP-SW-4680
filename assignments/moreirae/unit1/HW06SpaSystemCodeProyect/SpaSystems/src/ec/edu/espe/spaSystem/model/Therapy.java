
package ec.edu.espe.spaSystem.model;

/**
 *
 * @author Steven Pozo,Elkin Pabón,Ercik Moreira,David Ponce, DCCO-ESPE, DEES Developers
 */
public class Therapy {
    private String type;
    private String therapyPeriod;

    public Therapy(String type, String therapyPeriod) {
        this.type = type;
        this.therapyPeriod = therapyPeriod;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTherapyPeriod() {
        return therapyPeriod;
    }

    public void setTherapyPeriod(String therapyPeriod) {
        this.therapyPeriod = therapyPeriod;
    }

    @Override
    public String toString() {
        return "Therapy{" + "type=" + type + ", therapyPeriod=" + therapyPeriod + '}';
    }
    
}
