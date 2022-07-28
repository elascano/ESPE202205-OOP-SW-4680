package ec.edu.espe.exam.model;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class Building {
    private int size;
    private String typeOfBuilding;
    private int cost;
    private String material;
    private int numberOfFloors;

    @Override
    public String toString() {
        return "Building{" + "size=" + size + ", typeOfBuilding=" + typeOfBuilding + ", cost=" + cost + ", material=" + material + ", numberOfFloors=" + numberOfFloors + '}';
    }

    public Building() {
    }

    public Building(int size, String typeOfBuilding, int cost, String material, int numberOfFloors) {
        this.size = size;
        this.typeOfBuilding = typeOfBuilding;
        this.cost = cost;
        this.material = material;
        this.numberOfFloors = numberOfFloors;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the typeOfBuilding
     */
    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

    /**
     * @param typeOfBuilding the typeOfBuilding to set
     */
    public void setTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the numberOfFloors
     */
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    /**
     * @param numberOfFloors the numberOfFloors to set
     */
    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    
    
}
