
package ec.ecu.espe.traffic.model;

/**
 *
 * @author Elkin Pabon, DCCO ESPE, DEES Developers
 */
public class Car {
    
    private String model;
    private String plate;
    private String color;
    private String location;

    public Car(String model, String plate, String color, String location) {
        this.model = model;
        this.plate = plate;
        this.color = color;
        this.location = location;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the plate
     */
    public String getPlate() {
        return plate;
    }

    /**
     * @param plate the plate to set
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", plate=" + plate + ", color=" + color + ", location=" + location + '}';
    }
     
}
