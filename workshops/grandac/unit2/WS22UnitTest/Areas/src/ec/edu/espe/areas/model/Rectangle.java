package ec.edu.espe.areas.model;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class Rectangle {
    
   private double height;
   private double base;

    public Rectangle(double height, double base) {
        this.height = height;
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

    @Override
    public String toString() {
        return "Rectangle{" + "height=" + height + ", base=" + base + '}';
    }
   
    public double calculateArea(){
        double area;
        
        area= base*height;
        
        return area;
    }
     

}
