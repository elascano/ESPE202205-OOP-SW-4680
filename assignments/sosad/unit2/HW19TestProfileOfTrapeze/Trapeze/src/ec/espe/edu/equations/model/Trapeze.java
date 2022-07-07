package ec.espe.edu.equations.model;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Trapeze {

    private double longBase;
    private double shortBase;
    private double altitude;
    private double area;

    public Trapeze(double longBase, double shortBase, double altitude, double area) {
        this.longBase = longBase;
        this.shortBase = shortBase;
        this.altitude = altitude;
        this.area = Math.round(area);
    }

    /**
     * @return the longBase
     */
    public double getLongBase() {
        return longBase;
    }

    /**
     * @param longBase the longBase to set
     */
    public void setLongBase(double longBase) {
        this.longBase = longBase;
    }

    /**
     * @return the shortBase
     */
    public double getShortBase() {
        return shortBase;
    }

    /**
     * @param shortBase the shortBase to set
     */
    public void setShortBase(double shortBase) {
        this.shortBase = shortBase;
    }

    /**
     * @return the altitude
     */
    public double getAltitude() {
        return altitude;
    }

    /**
     * @param altitude the altitude to set
     */
    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }
    
    


 
    
}
