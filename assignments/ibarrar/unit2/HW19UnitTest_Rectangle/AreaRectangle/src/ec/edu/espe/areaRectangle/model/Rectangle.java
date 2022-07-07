
package ec.edu.espe.areaRectangle.model;

/**
 *
 * @author Ronny Ibarra, DCCO-ESPE, Syntax Error
 */
public class Rectangle {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "base=" + base + ", height=" + height + '}';
    }


    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
       
    
//    public double calculateAreaRectangle(){
//        double area;
//       
//        area=base*height;
//        return area;
//    }
}
